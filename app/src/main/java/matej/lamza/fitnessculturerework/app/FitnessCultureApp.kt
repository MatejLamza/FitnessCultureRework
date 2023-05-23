package matej.lamza.fitnessculturerework.app

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import matej.lamza.fitnessculturerework.navigation.NavigationHost
import matej.lamza.fitnessculturerework.ui.theme.FitnessCultureReworkTheme


@Composable
fun FitnessCultureApp() {
    FitnessCultureReworkTheme {
        val appViewModel = AppViewModel()
        FitnessCultureContent(appViewModel = appViewModel)
    }
}

@Composable
fun FitnessCultureContent(appViewModel: AppViewModel) {
    Scaffold { _ ->
        NavigationHost(appViewModel = appViewModel)
    }
}
