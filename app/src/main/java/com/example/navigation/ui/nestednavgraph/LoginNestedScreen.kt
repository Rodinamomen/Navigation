package com.example.navigation.ui.nestednavgraph

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigation.ui.nestednavgraph.navigation.NestedScreen

@Composable
fun LoginNestedScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Login Screen",
            modifier = Modifier,
            color = Color.Black,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            "go to signup",
            modifier = Modifier.clickable{
                navController.navigate(route = NestedScreen.SignupNestedScreen.route)
            },
            color = Color.Red,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            "go to home",
            modifier = Modifier.clickable{
                navController.navigate(route = NestedScreen.HomeNestedScreen.route)
            },
            color = Color.Blue,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold
        )

    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview() {
    LoginNestedScreen(rememberNavController())
}