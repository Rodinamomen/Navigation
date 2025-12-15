package com.example.navigation.ui.bottomnavigationbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val title : String,
    val route : String,
    val icon : ImageVector
) {
    object Home : BottomBarScreen(
        title = "Home",
        route = "home",
        icon = Icons.Default.Home
    )
    object Settings : BottomBarScreen(
        title = "Settings",
        route = "settings",
        icon = Icons.Default.Settings
    )
    object Profile : BottomBarScreen(
        title = "Profile",
        route = "profile",
        icon = Icons.Default.Person
    )
}