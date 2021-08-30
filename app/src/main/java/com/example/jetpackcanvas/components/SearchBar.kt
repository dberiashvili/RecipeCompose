package com.example.jetpackcanvas.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcanvas.R
import com.example.jetpackcanvas.screens.main.MainViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.FlowPreview

@FlowPreview
@Composable
fun SearchBar(
    viewModel: MainViewModel = viewModel()
) {
    val searchQuery = remember {
        mutableStateOf("search")
    }

    TextField(
        value = searchQuery.value, onValueChange = {
            searchQuery.value = it
        }, modifier = Modifier
            .padding(bottom = 30.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            backgroundColor = colorResource(id = R.color.whiteGray),
        )
    )


}
