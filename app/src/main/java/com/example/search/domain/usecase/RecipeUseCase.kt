package com.example.search.domain.usecase

import com.example.search.domain.repo.RecipesRepo
import com.example.search.domain.util.RecipeResult

class RecipeUseCase (private val recipesRepo: RecipesRepo){
    suspend operator fun invoke(): RecipeResult =  recipesRepo.getAllRecipes()
}