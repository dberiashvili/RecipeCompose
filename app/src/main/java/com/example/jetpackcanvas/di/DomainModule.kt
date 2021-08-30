package com.example.jetpackcanvas.di

import com.example.jetpackcanvas.data.RecipeRepoImpl
import com.example.jetpackcanvas.domain.repository.RecipeRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class DomainModule {
    @Provides
    fun provideRepo(): RecipeRepo = RecipeRepoImpl()
}