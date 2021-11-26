package com.example.playgroundcompose.ui.compose

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun MostrarPrueba() {
    Algo()
}


@Composable
fun Algo(
    modifier: Modifier = Modifier
) {

    Scaffold(

    ) {
    Tarjeta()
    }
}