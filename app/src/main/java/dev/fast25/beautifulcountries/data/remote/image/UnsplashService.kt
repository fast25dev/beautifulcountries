package dev.fast25.beautifulcountries.data.remote.image

import dev.fast25.beautifulcountries.model.Search
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UnsplashService {

    @GET("search/photos")
    fun getSearchResult(
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("per_page") per_page: Int = 30
    ): Call<Search>
}