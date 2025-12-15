package com.example.navigation.ui.bottomnavigationbar

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

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Profile,
        BottomBarScreen.Settings
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    NavigationBar {
        screens.forEach {
            BottomNavigationBarItem(
                screen = it,
                currentDestination = currentDestination,
                navController = navController
            )
        }
    }

}

@Composable
private fun RowScope.BottomNavigationBarItem(
    screen: BottomBarScreen,
    navController: NavHostController,
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