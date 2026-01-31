package com.example.search.domain.repo

import com.example.search.domain.model.RecipeList
import com.example.search.domain.util.RecipeResult

interface RecipesRepo {
    suspend fun getAllRecipes(): RecipeResult
}