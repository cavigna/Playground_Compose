package com.example.playgroundcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.playgroundcompose.ui.compose.Mostrarartjeta
import com.example.playgroundcompose.ui.theme.PlaygroundComposeTheme
import com.example.playgroundcompose.ui.theme.blueBackground

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlaygroundComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = blueBackground) {
                    Mostrarartjeta()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PlaygroundComposeTheme {
        Greeting("Android")
    }
}