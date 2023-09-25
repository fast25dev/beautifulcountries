package dev.fast25.beautifulcountries.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.fast25.beautifulcountries.R
import dev.fast25.beautifulcountries.model.SearchResultsItem

class ImageAdapter(private val images: ArrayList<SearchResultsItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ImageViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        )
    }

    override fun getItemCount() = images.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ImageViewHolder) {
            holder.apply {
                Glide.with(image)
                    .load(images[position].urls?.small)
                    .placeholder(R.drawable.img_place_holder)
                    .into(image)
            }
        }
    }

    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.ivImage)
    }
}