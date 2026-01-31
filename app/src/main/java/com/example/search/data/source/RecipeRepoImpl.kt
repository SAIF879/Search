package com.example.search.data.source

import com.example.search.data.api.ApiService
import com.example.search.data.mapper.toRecipeList
import com.example.search.domain.repo.RecipesRepo
import com.example.search.domain.util.RecipeResult

class RecipeRepoImpl(private val apiService: ApiService) : RecipesRepo {
    override suspend fun getAllRecipes(): RecipeResult {
        return runCatching { apiService.getAllRecipes() }.fold(
            onSuccess = {
                RecipeResult.Success(it.toRecipeList())
            },
            onFailure = {
                RecipeResult.Error(it.message ?: "Something went wrong")
            }
        )
    }

}