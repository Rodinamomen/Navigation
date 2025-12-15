package com.example.navigation.ui.bottomnavigationbar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController = navController) }
    ) { innerPadding ->
        Column(Modifier.padding(innerPadding)) {
            SetUpBottomNavigationBar(navController)
        }
    }
}
@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    MainScreen()
}