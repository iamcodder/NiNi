package com.pyepye.nini

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.pyepye.device_pairing.navigation.devicePairing
import com.pyepye.home_screen.navigation.homeScreen
import com.pyepye.navigation.DevicePairingKey
import com.pyepye.ui.theme.NiNiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NiNiTheme {
                val screenKeys = remember { mutableStateListOf<Any>(DevicePairingKey) }
                NavDisplay(backStack = screenKeys, onBack = {
                    screenKeys.removeLastOrNull()
                }, entryProvider = entryProvider {
                    devicePairing(screenKeys)
                    homeScreen()
                })
            }
        }
    }
}