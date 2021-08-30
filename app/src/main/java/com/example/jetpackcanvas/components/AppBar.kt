package com.example.jetpackcanvas.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcanvas.R

@Composable
fun AppBar(
    color: Color = colorResource(id = R.color.design_default_color_primary),
    hasBackButton: Boolean,
    hasCloseButton: Boolean
) {
    Row(horizontalArrangement = Arrangement.SpaceBetween) {
        Modifier
            .fillMaxWidth()
            .height(50.dp)
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            color = color
        ) {

            if (hasBackButton) {
                ShowBackButton()
            }
            if (hasCloseButton) {
                ShowCloseButton()
            }
        }
    }
}

@Composable
fun ShowCloseButton() {
    Image(
        painter = painterResource(id = R.drawable.ic_baseline_close_24),
        contentDescription = "close",
        alignment = Alignment.CenterEnd
    )
}

@Composable
fun ShowBackButton() {
    Image(
        painter = painterResource(id = R.drawable.ic_baseline_arrow_back_24),
        contentDescription = "back_button",
        alignment = Alignment.CenterStart
    )

}