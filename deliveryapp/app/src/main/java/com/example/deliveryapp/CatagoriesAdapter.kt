package com.example.deliveryapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.deliveryapp.databinding.CategoriesBinding

class CatagoriesAdapter(val catagoriesList: ArrayList<Catagories>) : RecyclerView.Adapter<CatagoriesAdapter.CatagoriesHolder>() {

    class CatagoriesHolder(val binding: CategoriesBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatagoriesHolder {
        val binding = CategoriesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CatagoriesHolder(binding)
    }

    override fun getItemCount(): Int {
        return catagoriesList.size
    }

    override fun onBindViewHolder(holder: CatagoriesHolder, position: Int) {
        val currentItem = catagoriesList[position]
        holder.binding.catagoies.text = currentItem.ctgfood
        holder.binding.ctgimage.setImageResource(currentItem.ctgimg)

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, currentItem.ctgfood, Toast.LENGTH_LONG).show()
        }
    }
}