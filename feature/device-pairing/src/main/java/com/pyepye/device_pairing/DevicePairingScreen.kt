package com.pyepye.device_pairing

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun DevicePairingScreen(onclick: () -> Unit = {}) {
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Text("Device Pairing Screen")
        Spacer(Modifier.height(16.dp))
        Button(onClick = {
            onclick.invoke()
        }) {
            Text("CLick Me", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
        }
    }
}