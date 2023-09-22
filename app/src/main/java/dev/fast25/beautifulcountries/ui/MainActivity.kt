package dev.fast25.beautifulcountries.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.airbnb.lottie.LottieAnimationView
import dev.fast25.beautifulcountries.R
import dev.fast25.beautifulcountries.adapter.CountryAdapter
import dev.fast25.beautifulcountries.data.remote.country.CountryClient
import dev.fast25.beautifulcountries.databinding.ActivityMainBinding
import dev.fast25.beautifulcountries.model.CountryResponseItem
import dev.fast25.beautifulcountries.util.Extensions.hide
import dev.fast25.beautifulcountries.util.Extensions.isInternetAvailable
import dev.fast25.beautifulcountries.util.Extensions.show
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val adapter by lazy { CountryAdapter() }
    private val list by lazy { ArrayList<CountryResponseItem>() }

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
        binding.apply {
            rvCountry.adapter = adapter
            rvCountry.layoutManager = LinearLayoutManager(this@MainActivity)
            etSearch.addTextChangedListener {
                adapter.filter.filter(it)
            }
        }
        adapter.onItemClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name", it)
            startActivity(intent)
        }

        if (isInternetAvailable()) loadCountry() else internet.show()

    }

    private fun loadCountry() {
        loading.show()
        CountryClient.apiService.getAllCountries()
            .enqueue(object : Callback<ArrayList<CountryResponseItem>> {
                override fun onResponse(
                    call: Call<ArrayList<CountryResponseItem>>,
                    response: Response<ArrayList<CountryResponseItem>>
                ) {
                    loading.hide()
                    if (response.isSuccessful && response.body() != null) {
                        adapter.mySubmitList(response.body()!!.shuffled())
                    }
                }

                override fun onFailure(call: Call<ArrayList<CountryResponseItem>>, t: Throwable) {
                    loading.hide()
                }
            })


    }
}