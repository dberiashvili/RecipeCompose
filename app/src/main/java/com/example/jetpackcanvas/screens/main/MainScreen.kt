package com.example.jetpackcanvas.screens.main

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.jetpackcanvas.components.RecipesList
import com.example.jetpackcanvas.components.RoundedSearchButton
import com.example.jetpackcanvas.components.SearchBar


@ExperimentalFoundationApi
@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun MainScreen(navController: NavController, viewModel: MainViewModel = viewModel()) {


    val isExpanded = remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = "Food Recipes \nFor you",
                style = MaterialTheme.typography.h5
            )

            RoundedSearchButton {
                isExpanded.value = !isExpanded.value
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        if (isExpanded.value) {
            SearchBar()
        }

        Spacer(modifier = Modifier.height(30.dp))




        RecipesList(
            recipes = viewModel.recipes.value,
            navController = navController
        )
    }
}