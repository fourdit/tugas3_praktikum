package com.example.ticketapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.Card
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.NumberFormat
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TicketScreen()
        }
    }
}

@Composable
fun TicketScreen() {

    val ticketPrice = 25000

    var ticketCount by remember {
        mutableStateOf(1)
    }

    val totalPrice = ticketPrice * ticketCount

    val currencyFormat = NumberFormat.getCurrencyInstance(
        Locale("id", "ID")
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Pemesanan Tiket",
            fontSize = 28.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                Text(
                    text = "Harga Tiket",
                    fontSize = 18.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = currencyFormat.format(ticketPrice),
                    fontSize = 24.sp
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Jumlah Tiket",
                    fontSize = 18.sp
                )

                Spacer(modifier = Modifier.height(12.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Button(
                        onClick = {
                            if (ticketCount > 1) {
                                ticketCount--
                            }
                        }
                    ) {
                        Text("-")
                    }

                    Spacer(modifier = Modifier.padding(12.dp))

                    Text(
                        text = "$ticketCount",
                        fontSize = 24.sp
                    )

                    Spacer(modifier = Modifier.padding(12.dp))

                    Button(
                        onClick = {
                            ticketCount++
                        }
                    ) {
                        Text("+")
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Total Bayar",
                    fontSize = 18.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = currencyFormat.format(totalPrice),
                    fontSize = 24.sp
                )

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = {
                        ticketCount = 1
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("RESET")
                }
            }
        }
    }
}