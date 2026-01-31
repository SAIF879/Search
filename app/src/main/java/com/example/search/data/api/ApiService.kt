package com.example.search.data.api

import com.example.search.data.dto.RecipeListDto
import retrofit2.http.GET

interface ApiService {

    @GET("/recipes")
    suspend fun getAllRecipes(): RecipeListDto

}