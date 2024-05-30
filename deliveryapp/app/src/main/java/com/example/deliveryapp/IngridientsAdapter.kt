package com.example.deliveryapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.deliveryapp.databinding.IngridientsBinding


class IngridientsAdapter(val ingridientsList:ArrayList<Ingridients>):RecyclerView.Adapter<IngridientsAdapter.IngridientsHolder>() {
    class IngridientsHolder(val binding:IngridientsBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngridientsHolder {
        val binding=IngridientsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return IngridientsHolder(binding)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: IngridientsHolder, position: Int) {
        TODO("Not yet implemented")
    }
}