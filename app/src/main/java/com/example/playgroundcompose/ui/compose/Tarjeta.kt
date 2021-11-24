package com.example.playgroundcompose.ui.compose

import android.content.res.Resources
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.playgroundcompose.ui.theme.*

@Preview(showBackground = true)
@Composable
fun Mostrarartjeta(
    modifier: Modifier = Modifier
) {
    Column(
        //modifier = modifier.fillMaxSize()
    ) {

        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            Text(
                "Indicadores De Chile",
                fontSize = 50.sp,
                fontFamily = FontFamily.Monospace,
                color = Color.White,


            )
        }

        Row(modifier = modifier.fillMaxSize()) {
            Spacer(modifier.size(50.dp))
            Column {
                Tarjeta()
                Tarjeta(color = orangeCard)
                Tarjeta(color = orangeCard)

            }
            Column {
                Tarjeta(color = purpleCard)
                Tarjeta(color = pinkCard)
                Tarjeta(color = pinkCard)

            }
        }


    }


}

@Composable
fun Tarjeta(
    modifier: Modifier = Modifier,
    color: Color = greenCard,
    monto: String = "123"
) {
    Surface(modifier = modifier.padding(10.dp), color = blueBackground) {
        Card(
            modifier = modifier.size(175.dp, 125.dp).padding(5.dp),
            shape = RoundedCornerShape(10.dp),
            backgroundColor = color,

            ) {
            Column(
                modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(monto)
            }
        }
    }

}