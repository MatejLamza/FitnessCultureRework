package matej.lamza.fitnessculturerework.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import matej.lamza.fitnessculturerework.app.AppViewModel
import matej.lamza.fitnessculturerework.ui.home.HomeScreen
import matej.lamza.fitnessculturerework.ui.login.LoginScreen
import matej.lamza.fitnessculturerework.ui.splash.SplashScreen

@Composable
fun NavigationHost(
    appViewModel: AppViewModel,
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") {
            SplashScreen(appViewModel = appViewModel,
                onNavigateToHomeScreen = { navController.navigateSingleTopTo("home") },
                onNavigateToLoginScreen = { navController.navigateSingleTopTo("login") })
        }
        composable("home") { HomeScreen() }
        composable("login") { LoginScreen() }
    }
}

fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) {
        // Pop up to the start destination of the graph to
        // avoid building up a large stack of destinations
        // on the back stack as users select items
        popUpTo(
            this@navigateSingleTopTo.graph.findStartDestination().id
        ) {
            saveState = true
            inclusive = true
        }
        // Avoid multiple copies of the same destination when reselecting the same item
        launchSingleTop = true
        // Restore state when reselecting a previously selected item
        restoreState = true
    }
