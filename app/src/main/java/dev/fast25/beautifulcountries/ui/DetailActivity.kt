package dev.fast25.beautifulcountries.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import dev.fast25.beautifulcountries.databinding.ActivityDetailBinding

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
        name = intent.getStringExtra("name") ?: "USA"
        binding.apply {
            tvName.text = name
        }

    }
}