package com.example.search.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class NewsResult(

    @SerialName("status"       ) var status       : String?            = null,
    @SerialName("totalResults" ) var totalResults : Int?               = null,
    @SerialName("results"      ) var results      : ArrayList<Results> = arrayListOf(),
    @SerialName("nextPage"     ) var nextPage     : String?            = null

)
