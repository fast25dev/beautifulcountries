package dev.fast25.beautifulcountries.model


import com.google.gson.annotations.SerializedName

data class Search(

    @field:SerializedName("total")
    val total: Int? = null,

    @field:SerializedName("total_pages")
    val totalPages: Int? = null,

    @field:SerializedName("results")
    val results: ArrayList<SearchResultsItem>? = null
)


data class SearchResultsItem(

    @field:SerializedName("urls")
    val urls: Urls? = null,

    @field:SerializedName("id")
    val id: String = ""

)

data class Urls(

    @field:SerializedName("small")
    val small: String? = null,

    @field:SerializedName("small_s3")
    val smallS3: String? = null,

    @field:SerializedName("thumb")
    val thumb: String? = null,

    @field:SerializedName("raw")
    val raw: String? = null,

    @field:SerializedName("regular")
    val regular: String? = null,

    @field:SerializedName("full")
    val full: String? = null
)