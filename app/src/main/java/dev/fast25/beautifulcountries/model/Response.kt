package dev.fast25.beautifulcountries.model

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("Response")
	val response: List<ResponseItem?>? = null
)

data class Ces(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Est(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Zho(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)



data class Urd(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Kor(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Ita(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Hrv(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Fra(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null,

	@field:SerializedName("f")
	val f: String? = null,

	@field:SerializedName("m")
	val m: String? = null
)

data class Cym(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class PostalCode(

	@field:SerializedName("regex")
	val regex: String? = null,

	@field:SerializedName("format")
	val format: String? = null
)

data class Demonyms(

	@field:SerializedName("fra")
	val fra: Fra? = null,

	@field:SerializedName("eng")
	val eng: Eng? = null
)

data class Per(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Translations(

	@field:SerializedName("hun")
	val hun: Hun? = null,

	@field:SerializedName("swe")
	val swe: Swe? = null,

	@field:SerializedName("zho")
	val zho: Zho? = null,

	@field:SerializedName("est")
	val est: Est? = null,

	@field:SerializedName("fin")
	val fin: Fin? = null,

	@field:SerializedName("pol")
	val pol: Pol? = null,

	@field:SerializedName("kor")
	val kor: Kor? = null,

	@field:SerializedName("ces")
	val ces: Ces? = null,

	@field:SerializedName("tur")
	val tur: Tur? = null,

	@field:SerializedName("ara")
	val ara: Ara? = null,

	@field:SerializedName("rus")
	val rus: Rus? = null,

	@field:SerializedName("por")
	val por: Por? = null,

	@field:SerializedName("bre")
	val bre: Bre? = null,

	@field:SerializedName("fra")
	val fra: Fra? = null,

	@field:SerializedName("deu")
	val deu: Deu? = null,

	@field:SerializedName("ita")
	val ita: Ita? = null,

	@field:SerializedName("per")
	val per: Per? = null,

	@field:SerializedName("spa")
	val spa: Spa? = null,

	@field:SerializedName("urd")
	val urd: Urd? = null,

	@field:SerializedName("nld")
	val nld: Nld? = null,

	@field:SerializedName("jpn")
	val jpn: Jpn? = null,

	@field:SerializedName("hrv")
	val hrv: Hrv? = null,

	@field:SerializedName("srp")
	val srp: Srp? = null,

	@field:SerializedName("slk")
	val slk: Slk? = null,

	@field:SerializedName("cym")
	val cym: Cym? = null
)

data class Jpn(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Tur(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Gini(

	@field:SerializedName("2018")
	val jsonMember2018: Any? = null
)

data class Bre(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Pol(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Nld(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)



data class Hun(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Swe(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)



data class Car(

	@field:SerializedName("side")
	val side: String? = null,

	@field:SerializedName("signs")
	val signs: List<String?>? = null
)

data class RUB(

	@field:SerializedName("symbol")
	val symbol: String? = null,

	@field:SerializedName("name")
	val name: String? = null
)


data class Rus(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Srp(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Slk(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class ResponseItem(

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

data class Languages(

	@field:SerializedName("rus")
	val rus: String? = null
)



data class Por(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class CapitalInfo(

	@field:SerializedName("latlng")
	val latlng: List<Any?>? = null
)

data class Eng(

	@field:SerializedName("f")
	val f: String? = null,

	@field:SerializedName("m")
	val m: String? = null
)

data class NativeName(

	@field:SerializedName("rus")
	val rus: Rus? = null
)

data class Deu(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Currencies(

	@field:SerializedName("RUB")
	val rUB: RUB? = null
)

data class Fin(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Ara(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)

data class Spa(

	@field:SerializedName("common")
	val common: String? = null,

	@field:SerializedName("official")
	val official: String? = null
)
