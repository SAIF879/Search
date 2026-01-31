package com.example.search.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Recipes(

    @SerialName("id") var id: Int? = null,
    @SerialName("name") var name: String? = null,
    @SerialName("ingredients") var ingredients: ArrayList<String> = arrayListOf(),
    @SerialName("instructions") var instructions: ArrayList<String> = arrayListOf(),
    @SerialName("prepTimeMinutes") var prepTimeMinutes: Int? = null,
    @SerialName("cookTimeMinutes") var cookTimeMinutes: Int? = null,
    @SerialName("servings") var servings: Int? = null,
    @SerialName("difficulty") var difficulty: String? = null,
    @SerialName("cuisine") var cuisine: String? = null,
    @SerialName("caloriesPerServing") var caloriesPerServing: Int? = null,
    @SerialName("tags") var tags: ArrayList<String> = arrayListOf(),
    @SerialName("userId") var userId: Int? = null,
    @SerialName("image") var image: String? = null,
    @SerialName("rating") var rating: Double? = null,
    @SerialName("reviewCount") var reviewCount: Int? = null,
    @SerialName("mealType") var mealType: ArrayList<String> = arrayListOf()

)