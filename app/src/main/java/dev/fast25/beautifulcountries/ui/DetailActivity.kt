package dev.fast25.beautifulcountries.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.bumptech.glide.Glide
import dev.fast25.beautifulcountries.R
import dev.fast25.beautifulcountries.adapter.ImageAdapter
import dev.fast25.beautifulcountries.data.remote.country.CountryClient
import dev.fast25.beautifulcountries.data.remote.image.UnsplashClient
import dev.fast25.beautifulcountries.databinding.ActivityDetailBinding
import dev.fast25.beautifulcountries.model.NameResponseItem
import dev.fast25.beautifulcountries.model.Search
import dev.fast25.beautifulcountries.util.Extensions.hide
import dev.fast25.beautifulcountries.util.Extensions.isInternetAvailable
import dev.fast25.beautifulcountries.util.Extensions.show
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailActivity : AppCompatActivity() {
    private val binding by lazy { ActivityDetailBinding.inflate(layoutInflater) }
    lateinit var name: String
    private lateinit var loading: LottieAnimationView
    private lateinit var internet: LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        loading = findViewById(R.id.loading)
        internet = findViewById(R.id.noInternet)
        name = intent.getStringExtra("name") ?: "USA"
        binding.apply {
            tvCountryName.text = name
        }
        if (isInternetAvailable()) loadInfo() else internet.show()

    }

    private fun loadInfo() {
        loading.show()
        Log.d("@@@@@", "loadInfo: ")
        CountryClient.apiService.getAllDataByName(name)
            .enqueue(object : Callback<ArrayList<NameResponseItem>> {
                override fun onResponse(
                    call: Call<ArrayList<NameResponseItem>>,
                    response: Response<ArrayList<NameResponseItem>>
                ) {
                    if (response.isSuccessful && response.body() != null) {
                        loadImages()
                        setData(response.body()!![0])
                    }
                    loading.hide()
                    Log.d("@@@@@", "loadInfo: ${response.errorBody()}")
                }

                override fun onFailure(call: Call<ArrayList<NameResponseItem>>, t: Throwable) {
                    loading.hide()
                    Log.d("@@@@@", "loadInfo: ${t.localizedMessage}")
                }
            })
    }

    @SuppressLint("SetTextI18n")
    private fun setData(item: NameResponseItem) {
        binding.apply {
            tvCommonName.text = "Common\t: ${item.name?.common}"
            tvOfficialName.text = "Official\t\t\t\t: ${item.name?.official}"
            tvCapital.text = "${item.capital?.get(0)}"
            tvContinents.text = "${item.continents?.get(0)}"
            Glide.with(ivFlag).load(item.flags?.png).placeholder(R.drawable.img_place_holder)
                .into(ivFlag)
            Glide.with(ivArmy).load(item.coatOfArms?.png).placeholder(R.drawable.img_place_holder)
                .into(ivArmy)
            Glide.with(ivCountry).load(item.flags?.png).placeholder(R.drawable.img_place_holder)
                .into(ivCountry)

            var tld = ""
            for (i in item.tld?.indices!!) {
                tld += "${i + 1})\t\t${item.tld[i]}\n"
            }
            tvTLD.text = tld
            tvArea.text = "${item.area} km²"
            tvPopulation.text = "${item.population}"
        }
    }

    private fun loadImages() {
        loading.show()
        UnsplashClient.apiService.getSearchResult(name).enqueue(object : Callback<Search> {
            override fun onResponse(call: Call<Search>, response: Response<Search>) {
                if (response.isSuccessful && response.body() != null) {

                    binding.rvImages.adapter = ImageAdapter(response.body()!!.results!!)
                }
                loading.hide()
            }

            override fun onFailure(call: Call<Search>, t: Throwable) {
                loading.hide()
            }
        })
    }
}