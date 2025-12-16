package com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.auth

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.navigation.NestedScreen

@Composable
fun LoginNestedScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Login Screen",
            modifier = Modifier.clickable{
                // navigate to home nav graph
                navController.navigate("home_nested")
            },
            color = Color.Red,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            "Go to Signup",
            modifier = Modifier.clickable{
                // go to signup
                navController.navigate(NestedScreen.SignupNestedScreen.route)
            },
            color = Color.Red,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            "Forget Password",
            modifier = Modifier.clickable{
                // go to forget password
                navController.navigate(NestedScreen.ForgetNestedScreen.route)
            },
            color = Color.Blue,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Medium
        )
    }
}
@Preview(showBackground = true)
@Composable
private fun LoginNestedScreenPreview() {
    LoginNestedScreen(rememberNavController())
}