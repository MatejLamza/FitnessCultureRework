package matej.lamza.fitnessculturerework.ui.login

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


/*val configuration = LocalConfiguration.current
val screenHeight = configuration.screenHeightDp
val screenWidth = configuration.screenWidthDp
Log.d("bbb", "LoginScreen: WIDTH: $screenWidth  \n HEIGHT: $screenHeight")
Canvas(modifier = Modifier.fillMaxSize()) {

    drawLine(
        color = Color.Gray,
        start = Offset(0f, 1250f),
        end = Offset(1250f, 1550f),
        strokeWidth = 3f
    )
}*/

@Preview
@Composable
fun LoginScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Text("Hello from login screen")
        }
    }
}
