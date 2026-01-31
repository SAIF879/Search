package com.example.search.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RecipeListDto(
    @SerialName("recipes" ) var recipes : ArrayList<Recipes> = arrayListOf(),
    @SerialName("total"   ) var total   : Int?               = null,
    @SerialName("skip"    ) var skip    : Int?               = null,
    @SerialName("limit"   ) var limit   : Int?               = null
)