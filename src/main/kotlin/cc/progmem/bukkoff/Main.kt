package cc.progmem.bukkoff

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.jthemedetecor.OsThemeDetector

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = APP_NAME,
    ) {
        App()
    }
}

@Composable
@Preview
fun App() {
    Text("I don't like niggers")
}