package com.example.search.domain.model

data class Recipe(
    val name : String ,
    val ingredients : List<String> ,
    val instructions : List<String> ,
    val prepTimeMinutes : Int ,
    val cookTimeMinutes : Int ,
    val servings : Int ,
    val difficulty : String ,
    val cuisine : String ,
    val caloriesPerServing : Int ,
    val image : String ,
)