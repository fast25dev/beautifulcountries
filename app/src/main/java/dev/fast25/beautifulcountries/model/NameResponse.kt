package dev.fast25.beautifulcountries.model

import com.google.gson.annotations.SerializedName


data class NameResponseItem(

    @field:SerializedName("capital")
    val capital: List<String?>? = null,

    @field:SerializedName("flag")
    val flag: String? = null,

    @field:SerializedName("independent")
    val independent: Boolean? = null,

    @field:SerializedName("landlocked")
    val landlocked: Boolean? = null,

    @field:SerializedName("borders")
    val borders: List<String?>? = null,

    @field:SerializedName("postalCode")
    val postalCode: PostalCode? = null,

    @field:SerializedName("flags")
    val flags: Flags? = null,

    @field:SerializedName("capitalInfo")
    val capitalInfo: CapitalInfo? = null,

    @field:SerializedName("ccn3")
    val ccn3: String? = null,

    @field:SerializedName("coatOfArms")
    val coatOfArms: CoatOfArms? = null,

    @field:SerializedName("demonyms")
    val demonyms: Demonyms? = null,

    @field:SerializedName("fifa")
    val fifa: String? = null,

    @field:SerializedName("cioc")
    val cioc: String? = null,

    @field:SerializedName("car")
    val car: Car? = null,

    @field:SerializedName("translations")
    val translations: Translations? = null,

    @field:SerializedName("altSpellings")
    val altSpellings: List<String?>? = null,

    @field:SerializedName("area")
    val area: Any? = null,

    @field:SerializedName("languages")
    val languages: Languages? = null,

    @field:SerializedName("maps")
    val maps: Maps? = null,

    @field:SerializedName("subregion")
    val subregion: String? = null,

    @field:SerializedName("idd")
    val idd: Idd? = null,

    @field:SerializedName("tld")
    val tld: List<String?>? = null,

    @field:SerializedName("unMember")
    val unMember: Boolean? = null,

    @field:SerializedName("gini")
    val gini: Gini? = null,

    @field:SerializedName("continents")
    val continents: List<String?>? = null,

    @field:SerializedName("population")
    val population: Int? = null,

    @field:SerializedName("startOfWeek")
    val startOfWeek: String? = null,

    @field:SerializedName("timezones")
    val timezones: List<String?>? = null,

    @field:SerializedName("name")
    val name: Name? = null,

    @field:SerializedName("cca3")
    val cca3: String? = null,

    @field:SerializedName("region")
    val region: String? = null,

    @field:SerializedName("latlng")
    val latlng: List<Any?>? = null,

    @field:SerializedName("cca2")
    val cca2: String? = null,

    @field:SerializedName("status")
    val status: String? = null,

    @field:SerializedName("currencies")
    val currencies: Currencies? = null
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
