package com.example.playgroundcompose.ui.compose

import android.content.res.Resources
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.playgroundcompose.ui.theme.Teal200
import com.example.playgroundcompose.ui.theme.greenCard
import com.example.playgroundcompose.ui.theme.purpleCard

@Preview
@Composable
fun Mostrarartjeta(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize()
    ) {

        Row{
            Column(
                modifier = modifier.fillMaxSize()
            ) {
                Tarjeta()
                Tarjeta(color = purpleCard)

            }


        }

        Row{
            Column(
                modifier = modifier.fillMaxSize()
            ) {
                Tarjeta()
                Spacer(modifier.size(50.dp))
                Tarjeta(color = purpleCard)
                Tarjeta(color = purpleCard)
                Tarjeta(color = purpleCard)
                Tarjeta(color = purpleCard)
                Tarjeta(color = purpleCard)
                Tarjeta(color = purpleCard)
            }


        }



    }

}

@Composable
fun Tarjeta(
    modifier: Modifier = Modifier,
    color: Color = greenCard,
    monto: String = "123"
){
    Surface(modifier = modifier.padding(10.dp)){
        Card(
            modifier = modifier.size(175.dp, 125.dp).padding(5.dp),
            shape = RoundedCornerShape(10.dp),
            backgroundColor = color,

        ) {
            Column(
                modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(monto)
            }
        }
    }

}