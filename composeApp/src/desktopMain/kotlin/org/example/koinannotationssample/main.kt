package org.example.koinannotationssample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Koin Annotations Sample",
    ) {
        App()
    }
}