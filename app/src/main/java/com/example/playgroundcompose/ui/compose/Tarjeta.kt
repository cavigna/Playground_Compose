package com.example.playgroundcompose.ui.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Mostrarartjeta(){
    Tarjeta()
}

@Composable
fun Tarjeta(
    modifier: Modifier = Modifier,
    monto: String = "123"
){
    Card(
        modifier = modifier
    ) {
        Column(modifier.fillMaxWidth()){
            Text(monto)
        }
    }
}