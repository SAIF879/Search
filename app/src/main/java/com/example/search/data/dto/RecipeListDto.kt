package com.example.search.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RecipeListDto(
    @SerialName("recipes" ) var recipes : ArrayList<RecipesDto> = arrayListOf(),
    @SerialName("total"   ) var total   : Int?               = null,
    @SerialName("skip"    ) var skip    : Int?               = null,
    @SerialName("limit"   ) var limit   : Int?               = null
)