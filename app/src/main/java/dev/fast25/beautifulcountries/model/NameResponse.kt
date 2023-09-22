package dev.fast25.beautifulcountries.model

import com.google.gson.annotations.SerializedName


data class NameResponseItem(

    @field:SerializedName("capital")
    val capital: List<String?>? = null,

    @field:SerializedName("flag")
    val flag: String? = null,

    @field:SerializedName("independent")
    val independent: Boolean? = null,

    @field:SerializedName("flags")
    val flags: Flags? = null,

    @field:SerializedName("coatOfArms")
    val coatOfArms: CoatOfArms? = null,

    @field:SerializedName("area")
    val area: Int = 1,

    @field:SerializedName("maps")
    val maps: Maps? = null,

    @field:SerializedName("subregion")
    val subregion: String? = null,

    @field:SerializedName("idd")
    val idd: Idd? = null,

    @field:SerializedName("tld")
    val tld: ArrayList<String>? = null,

    @field:SerializedName("continents")
    val continents: ArrayList<String>? = null,

    @field:SerializedName("population")
    val population: Int = 1,

    @field:SerializedName("timezones")
    val timezones: ArrayList<String>? = null,

    @field:SerializedName("name")
    val name: Name? = null,

    @field:SerializedName("status")
    val status: String? = null,

    @field:SerializedName("currencies")
    val currencies: Any? = null
)


data class Name(

    @field:SerializedName("common")
    val common: String? = null,

    @field:SerializedName("official")
    val official: String? = null
)

data class CoatOfArms(

    @field:SerializedName("svg")
    val svg: String? = null,

    @field:SerializedName("png")
    val png: String? = null
)

data class Idd(

    @field:SerializedName("suffixes")
    val suffixes: ArrayList<String>? = null,

    @field:SerializedName("root")
    val root: String? = null
)

data class Maps(

    @field:SerializedName("openStreetMaps")
    val openStreetMaps: String? = null,

    @field:SerializedName("googleMaps")
    val googleMaps: String? = null
)
