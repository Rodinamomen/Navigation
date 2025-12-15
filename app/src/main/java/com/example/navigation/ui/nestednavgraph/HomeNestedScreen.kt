package com.example.navigation.ui.nestednavgraph

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeNestedScreen(navController: NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Home",
            modifier = Modifier.clickable {
                // navigate to details
            },
            color = MaterialTheme.colorScheme.primary,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            "AuthGraph",
            modifier = Modifier.clickable {
                navController.navigate("AuthGraph")
            },
            color = MaterialTheme.colorScheme.primary,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}
@Composable
@Preview
fun HomeScreenPreview(){
    HomeNestedScreen(rememberNavController())
}