package com.example.navigation.ui.bottombarwithnestednavigation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeNestedScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        Text("Home",
            modifier = Modifier.clickable{
                // go to Details Graph
                navController.navigate("details_nested")
            }, color = Color.White, fontSize = 24.sp)
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeNestedScreenPreview() {
    HomeNestedScreen(rememberNavController())
}