package com.example.jetpackcanvas.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.jetpackcanvas.domain.RecipeModel

@Composable
fun DetailsScreen(
    navController: NavController,
    recipe: RecipeModel
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = rememberImagePainter(recipe.imageUrl),
            contentDescription = "image",
            modifier = Modifier
                .fillMaxWidth()
                .height(225.dp),
            contentScale = ContentScale.Crop,
        )


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            elevation = 6.dp,
            shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
        ) {
            Column {
                Text(
                    text = recipe.title,
                    modifier = Modifier
                        .padding(30.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                )

                Text(
                    text = recipe.description,
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        }

    }

}
