package com.example.jetpackcanvas.domain.repository

import com.example.jetpackcanvas.domain.RecipeModel
import kotlinx.coroutines.flow.Flow

interface RecipeRepo {
    suspend fun getRecipes(): Flow<List<RecipeModel>>
}