package com.example.myapplication.screen

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HalamanUtama() {
    val context = LocalContext.current
    Column(modifier = Modifier.fillMaxSize().
    padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        ProfilMahasiswa()
        Spacer(modifier = Modifier.height(16.dp))
        ContactUsScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun HalamanUtamaPreview() {

    HalamanUtama()
}
