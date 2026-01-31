package com.example.search.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Results (

    @SerialName("article_id"      ) var articleId      : String?           = null,
    @SerialName("link"            ) var link           : String?           = null,
    @SerialName("title"           ) var title          : String?           = null,
    @SerialName("description"     ) var description    : String?           = null,
    @SerialName("content"         ) var content        : String?           = null,
    @SerialName("keywords"        ) var keywords       : ArrayList<String> = arrayListOf(),
    @SerialName("creator"         ) var creator        : ArrayList<String> = arrayListOf(),
    @SerialName("language"        ) var language       : String?           = null,
    @SerialName("country"         ) var country        : ArrayList<String> = arrayListOf(),
    @SerialName("category"        ) var category       : ArrayList<String> = arrayListOf(),
    @SerialName("datatype"        ) var datatype       : String?           = null,
    @SerialName("pubDate"         ) var pubDate        : String?           = null,
    @SerialName("pubDateTZ"       ) var pubDateTZ      : String?           = null,
    @SerialName("fetched_at"      ) var fetchedAt      : String?           = null,
    @SerialName("image_url"       ) var imageUrl       : String?           = null,
    @SerialName("video_url"       ) var videoUrl       : String?           = null,
    @SerialName("source_id"       ) var sourceId       : String?           = null,
    @SerialName("source_name"     ) var sourceName     : String?           = null,
    @SerialName("source_priority" ) var sourcePriority : Int?              = null,
    @SerialName("source_url"      ) var sourceUrl      : String?           = null,
    @SerialName("source_icon"     ) var sourceIcon     : String?           = null,
    @SerialName("sentiment"       ) var sentiment      : String?           = null,
    @SerialName("sentiment_stats" ) var sentimentStats : String?           = null,
    @SerialName("ai_tag"          ) var aiTag          : String?           = null,
    @SerialName("ai_region"       ) var aiRegion       : String?           = null,
    @SerialName("ai_org"          ) var aiOrg          : String?           = null,
    @SerialName("ai_summary"      ) var aiSummary      : String?           = null,
    @SerialName("duplicate"       ) var duplicate      : Boolean?          = null

)