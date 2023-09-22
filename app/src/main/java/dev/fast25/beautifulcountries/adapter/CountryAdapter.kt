package dev.fast25.beautifulcountries.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.fast25.beautifulcountries.R
import dev.fast25.beautifulcountries.databinding.ItemCountryBinding
import dev.fast25.beautifulcountries.model.CountryResponseItem

class CountryAdapter : ListAdapter<CountryResponseItem, CountryAdapter.VH>(DIFFER), Filterable {

    private var list: List<CountryResponseItem>? = null

    var onItemClick: ((String) -> Unit)? = null


    inner class VH(private val binding: ItemCountryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val country = currentList[adapterPosition]
            binding.apply {
                tvName.text = country.name?.common
                Glide.with(ivFlag).load(country.flags?.png).placeholder(R.drawable.img_place_holder)
                    .into(ivFlag)
                root.setOnClickListener {
                    onItemClick?.invoke(country.name?.common ?: "USA")
                }
            }
        }
    }

    fun mySubmitList(list: List<CountryResponseItem>) {
        this.list = list
        submitList(list)
    }

    object DIFFER : DiffUtil.ItemCallback<CountryResponseItem>() {
        override fun areItemsTheSame(
            oldItem: CountryResponseItem,
            newItem: CountryResponseItem
        ): Boolean {
            return oldItem.name?.common == newItem.name?.common
        }

        override fun areContentsTheSame(
            oldItem: CountryResponseItem,
            newItem: CountryResponseItem
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(ItemCountryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind()
    }

    override fun getFilter(): Filter {
        return customFilter
    }

    private var customFilter = object : Filter() {
        override fun performFiltering(p0: CharSequence?): FilterResults {
            val filteredList = mutableListOf<CountryResponseItem>()
            if (p0.isNullOrEmpty()) {
                filteredList.addAll(list!!)
            } else {
                for (item in list!!) {
                    if (item.name?.common?.lowercase()
                            ?.contains(p0.toString().lowercase()) == true
                    ) {
                        filteredList.add(item)
                    }
                }
            }
            val results = FilterResults()
            results.values = filteredList
            return results
        }

        override fun publishResults(p0: CharSequence?, p1: FilterResults?) {
            submitList(p1?.values as MutableList<CountryResponseItem>)
        }

    }
}