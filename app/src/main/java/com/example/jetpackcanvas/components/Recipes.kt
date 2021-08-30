package com.example.jetpackcanvas.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.jetpackcanvas.domain.RecipeModel
import com.example.jetpackcanvas.navigation.Screen

@ExperimentalFoundationApi
@Composable
fun RecipesList(recipes: List<RecipeModel>, navController: NavController) {
    LazyVerticalGrid(cells = GridCells.Fixed(2)) {
        items(recipes) { recipe ->
            Recipe(recipe = recipe, onClick = {
                navController.currentBackStackEntry?.arguments?.putParcelable("recipe", recipe)
                navController.navigate(
                    Screen.DetailsScreen.route
                )
            })
        }
    }
}

@Composable
fun Recipe(
    recipe: RecipeModel,
    onClick: () -> Unit
) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(10.dp)
            .clickable(onClick = onClick),
        elevation = 5.dp
    ) {

        Column {
            Image(
                painter = rememberImagePainter(recipe.imageUrl),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop,
                contentDescription = recipe.title
            )

            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = recipe.title,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.dp)
                )
            }


        }


    }

    Spacer(modifier = Modifier.height(30.dp))

}