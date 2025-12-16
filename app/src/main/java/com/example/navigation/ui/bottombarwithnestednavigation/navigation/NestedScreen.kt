package com.example.navigation.ui.bottombarwithnestednavigation.navigation

sealed class NestedScreen(val route: String) {
    object LoginNestedScreen : NestedScreen("login_nested_screen")
    object SignupNestedScreen : NestedScreen("signup_nested_screen")
    object ForgetNestedScreen : NestedScreen("forget_nested_screen")
    object InformationNestedScreen : NestedScreen("information_nested_screen")
    object OverviewNestedScreen : NestedScreen("overview_nested_screen")
}