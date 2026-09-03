package com.example.myapplication.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
    }
}

@Preview
@Composable
fun HalamanUtamaPreview() {
    HalamanUtama()
    Spacer(modifier = Modifier.height(16.dp))

    
}
