package dev.fast25.beautifulcountries.data.remote.image

import dev.fast25.beautifulcountries.util.Consts
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object UnsplashClient {
    private const val isTester = true
    private const val SERVER_DEVELOPMENT = "https://api.unsplash.com/"
    private const val SERVER_PRODUCTION = "https://api.unsplash.com/"

    private val baseURL = if (isTester) SERVER_DEVELOPMENT else SERVER_PRODUCTION


    private val client = OkHttpClient.Builder().addInterceptor(Interceptor { chain ->
        val builder = chain.request().newBuilder()
        builder.addHeader(
            Consts.tokenKey,
            Consts.tokenValue
        )
        chain.proceed(builder.build())
    }).build()


    private val retrofit = Retrofit.Builder()
        .baseUrl(baseURL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    val apiService = retrofit.create(UnsplashService::class.java)

}