package com.example.jetpackcanvas.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcanvas.domain.RecipeModel
import com.example.jetpackcanvas.screens.SplashScreen
import com.example.jetpackcanvas.screens.details.DetailsScreen
import com.example.jetpackcanvas.screens.main.MainScreen

@ExperimentalFoundationApi
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screen.Splash.route) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }

        composable(
            route = Screen.MainScreen.route,
        ) {
            MainScreen(navController = navController)
        }

        composable(Screen.DetailsScreen.route) {
            val recipe =
                navController.previousBackStackEntry?.arguments?.getParcelable<RecipeModel>("recipe")

            recipe?.let { it1 -> DetailsScreen(navController, recipe = it1) }
        }
    }
}