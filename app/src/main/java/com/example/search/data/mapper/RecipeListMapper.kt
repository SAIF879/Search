package com.example.search.data.mapper

import com.example.search.data.dto.RecipeListDto
import com.example.search.data.dto.RecipesDto
import com.example.search.domain.model.Recipe
import com.example.search.domain.model.RecipeList

fun RecipeListDto.toRecipeList (): RecipeList {
    return RecipeList(
        recipes = recipes.map { it.toRecipes() },
        total = total?:0
    )
}

fun RecipesDto.toRecipes() : Recipe{
    return Recipe(
        name = name?:"Not Available",
        ingredients = ingredients,
        instructions = instructions,
        prepTimeMinutes = prepTimeMinutes?:0,
        cookTimeMinutes = cookTimeMinutes?:0,
        servings = servings?:0,
        difficulty = difficulty?:"Not Available",
        cuisine = cuisine?:"Not Available",
        caloriesPerServing = caloriesPerServing?:0,
        image = image?:"_"
    )
}