package dev.fast25.beautifulcountries.model

import com.google.gson.annotations.SerializedName


data class CountryResponseItem(

    @field:SerializedName("flags")
    val flags: Flags? = null,

    @field:SerializedName("name")
    val name: Name? = null
)

data class Flags(

    @field:SerializedName("svg")
    val svg: String? = null,

    @field:SerializedName("png")
    val png: String = "",

    @field:SerializedName("alt")
    val alt: String? = null
)
