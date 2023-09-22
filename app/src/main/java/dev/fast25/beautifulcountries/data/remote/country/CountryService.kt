package dev.fast25.beautifulcountries.data.remote.country

import dev.fast25.beautifulcountries.model.CountryResponseItem
import dev.fast25.beautifulcountries.model.NameResponseItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CountryService {

    @GET("all?fields=name,flags")
    fun getAllCountries(): Call<ArrayList<CountryResponseItem>>

    @GET("name/{common}")
    fun getAllDataByName(
        @Path("common") common: String = "USA"
    ): Call<ArrayList<NameResponseItem>>

}