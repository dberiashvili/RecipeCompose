package com.example.jetpackcanvas.screens.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpackcanvas.data.RecipeRepoImpl
import com.example.jetpackcanvas.domain.repository.RecipeRepo
import com.example.jetpackcanvas.domain.RecipeModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(

) : ViewModel() {
    private val repo: RecipeRepo = RecipeRepoImpl()
    val recipes = MutableStateFlow(
        listOf(
            RecipeModel(
                0, "", "", "", false
            )
        )
    )

    init {
        viewModelScope.launch {
            repo.getRecipes().collect {
                recipes.emit(it)
            }
        }
    }

}
