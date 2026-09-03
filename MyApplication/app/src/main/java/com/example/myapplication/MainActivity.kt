package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.myapplication.ui.theme.MyApplicationTheme
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val angka = 10
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Tugas Praktikum Compose",
                    fontSize = 24.sp
                )
                Spacer(modifier = Modifier.height(16.dp))
// Gambar dari internet
                AsyncImage(
                    model = "https://picsum.photos/800/600",
                    contentDescription = null,
                    placeholder = painterResource(R.drawable.outline_10mp_24),
                    error = painterResource(R.drawable.outline_10mp_24)
                )
                Spacer(modifier = Modifier.height(16.dp))
                val hasil = 100 / angka
                Text(
                    text = "Hasil: $hasil"
                )
            }
        }
    }
}


@Composable
fun UserInfo(name: String, nim: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hello World!")
        Text(text = "Nama: $name")
        Text(text = "NIM: $nim")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        UserInfo("", "")
    }
}
