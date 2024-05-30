package com.example.deliveryapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.deliveryapp.databinding.DishesBinding

class DishesAdapter(val dishesList: ArrayList<Dishes>) : RecyclerView.Adapter<DishesAdapter.DishHolder>() {

    class DishHolder(val binding: DishesBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishHolder {
        val binding = DishesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DishHolder(binding)
    }

    override fun getItemCount(): Int {
        return dishesList.size
    }

    override fun onBindViewHolder(holder: DishHolder, position: Int) {
        val currentDish = dishesList[position]
        holder.binding.foodimg.setImageResource(currentDish.dishesImg)
        holder.binding.foodname.text = currentDish.dishesName
        holder.binding.foodrate.text = currentDish.dishRating
        holder.binding.foodtime.text = currentDish.dishTime
        holder.binding.foodcost.text = currentDish.dishCost
        holder.itemView.setOnClickListener {
            val intent= Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("Dish",dishesList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}