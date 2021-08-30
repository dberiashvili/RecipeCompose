package com.example.jetpackcanvas.data

import com.example.jetpackcanvas.domain.repository.RecipeRepo
import com.example.jetpackcanvas.domain.RecipeModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class RecipeRepoImpl : RecipeRepo {
    private val data = FakeData

    override suspend fun getRecipes(): Flow<List<RecipeModel>> {
        return flowOf(data.recipes)
    }
}