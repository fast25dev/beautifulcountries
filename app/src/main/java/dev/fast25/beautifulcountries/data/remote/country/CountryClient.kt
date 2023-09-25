package dev.fast25.beautifulcountries.data.remote.country

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CountryClient {

    private const val isTester = true
    private const val SERVER_DEVELOPMENT = "https://restcountries.com/v3.1/"
    private const val SERVER_PRODUCTION = "https://restcountries.com/v3.1/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl())
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    val apiService: CountryService = retrofit.create(CountryService::class.java)


    private fun baseUrl() = if (isTester) SERVER_DEVELOPMENT else SERVER_PRODUCTION


}
