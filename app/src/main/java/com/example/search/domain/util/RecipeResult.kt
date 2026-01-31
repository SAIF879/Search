package com.example.search.domain.util

import com.example.search.domain.model.RecipeList

sealed class RecipeResult {
    data class Success(val data: RecipeList) : RecipeResult()
    data class Error(val message: String) : RecipeResult()
}