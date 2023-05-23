package matej.lamza.fitnessculturerework.ui.splash

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import matej.lamza.fitnessculturerework.app.AppViewModel
import matej.lamza.fitnessculturerework.common.ViewState

@Composable
fun SplashScreen(
    appViewModel: AppViewModel,
    onNavigateToLoginScreen: () -> Unit = {},
    onNavigateToHomeScreen: () -> Unit = {},
) {
    val viewState by appViewModel.viewState.collectAsState()

    when (viewState) {
        ViewState.Loading -> SplashScreenContent()
        ViewState.Authorized -> onNavigateToHomeScreen()
        ViewState.Unauthorized -> onNavigateToLoginScreen()
    }
}

@Composable
private fun SplashScreenContent() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Text(text = "Hello this is splash screen")
    }
}
