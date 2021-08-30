package com.example.jetpackcanvas.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object MainScreen : Screen("main")
    object DetailsScreen : Screen("details")
}
