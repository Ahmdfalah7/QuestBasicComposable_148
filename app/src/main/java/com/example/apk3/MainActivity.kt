package com.example.apk3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apk3.ui.theme.Apk3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Apk3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose(
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "ONE PIECE",
            style = TextStyle(
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            ),
            modifier = Modifier.padding(bottom = 16.dp)
        )


        Text(
            text = "Serial Anime",
            fontSize = 18.sp,
            modifier = Modifier.padding(bottom = 24.dp)
        )


        Image(
            painter = painterResource(id = R.drawable.img3),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 32.dp)
        )

        Text(
            text = "Nama",
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = "Ahmad Falah Prawira",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
        )

        Text(text = "20220140148",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
            color = Color.Red,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.puks),
            contentDescription = null,

        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Apk3Theme {
        BasicCompose()
    }
}
