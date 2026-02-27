package com.pyepye.device_pairing.navigation

import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation3.runtime.EntryProviderScope
import com.pyepye.device_pairing.DevicePairingScreen
import com.pyepye.navigation.DevicePairingKey
import com.pyepye.navigation.HomeScreenKey

fun EntryProviderScope<Any>.devicePairing(screenKeys: SnapshotStateList<Any>) {
    entry<DevicePairingKey> {
        DevicePairingScreen {
            screenKeys.add(HomeScreenKey)
        }
    }
}
