package com.example.search.domain.repo

import com.example.search.domain.model.RecipeList

interface RecipesRepo {
    suspend fun getAllRecipes(): RecipeList
}