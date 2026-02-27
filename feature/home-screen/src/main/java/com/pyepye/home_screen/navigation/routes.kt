package com.pyepye.home_screen.navigation

import androidx.navigation3.runtime.EntryProviderScope
import com.pyepye.home_screen.HomeScreen
import com.pyepye.navigation.HomeScreenKey

fun EntryProviderScope<Any>.homeScreen() {
    entry<HomeScreenKey> {
        HomeScreen()
    }
}