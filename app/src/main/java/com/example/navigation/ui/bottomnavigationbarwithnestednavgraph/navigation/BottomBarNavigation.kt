package com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarNavigation(val title: String, val icon: ImageVector, val route: String) {
    object HomeNestedScreen :
        BottomBarNavigation(route = "home_nested_screen", title = "Home", icon = Icons.Default.Home)
    object ProfileNestedScreen :
        BottomBarNavigation(route = "profile_nested_screen", title = "Profile", icon = Icons.Default.Person)

    object SettingsNestedScreen :
        BottomBarNavigation(route = "settings_nested_screen", title = "Settings", icon = Icons.Default.Settings)
}