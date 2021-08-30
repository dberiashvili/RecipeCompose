package com.example.jetpackcanvas.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcanvas.R


@Composable
fun RoundedSearchButton(
    onShow: () -> Unit
) {

    Button(
        onClick = {
            onShow.invoke()
        }, shape = CircleShape, colors = ButtonDefaults.buttonColors(
            backgroundColor = colorResource(id = R.color.redPink)
        )
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_search_24),
            contentDescription = "Sort",
            modifier = Modifier.padding(10.dp)
        )
    }
}
