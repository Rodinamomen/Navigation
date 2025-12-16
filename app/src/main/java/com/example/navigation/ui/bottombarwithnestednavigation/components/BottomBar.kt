package com.example.navigation.ui.bottombarwithnestednavigation.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.navigation.ui.bottombarwithnestednavigation.navigation.BottomBarNavigation

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarNavigation.HomeNestedScreen,
        BottomBarNavigation.ProfileNestedScreen,
        BottomBarNavigation.SettingsNestedScreen
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    NavigationBar() {
        screens.forEach {
            BottomBarItem(navController = navController, screen = it, currentDestination = currentDestination)
        }
    }
}

@Composable
private fun RowScope.BottomBarItem(
    navController: NavHostController,
    screen: BottomBarNavigation,
    currentDestination: NavDestination?,
) {
    NavigationBarItem(
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        onClick = {
            navController.popBackStack()
            navController.navigate(screen.route)
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = null
            )
        },
        label = {
            Text(text = screen.title)
        },
    )
}