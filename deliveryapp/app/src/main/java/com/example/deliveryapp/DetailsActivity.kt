package com.example.deliveryapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.deliveryapp.databinding.DishesBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: DishesBinding
    private lateinit var ingridientsList: ArrayList<Ingridients>
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding=DishesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val intent=Intent()
        val selectedItem=Intent().getSerializableExtra("Dish") as Dishes
        binding.foodname.text=selectedItem.dishesName
        binding.foodrate.text=selectedItem.dishRating
        binding.foodcost.text=selectedItem.dishCost
        binding.foodtime.text=selectedItem.dishTime
        binding.foodimg.setImageResource(selectedItem.dishesImg)
        binding.rateimg.setImageResource(selectedItem.ratingIcon)
        binding.timeimg.setImageResource(selectedItem.timeIcon)

        val ingridientsList=ArrayList<Ingridients>()
        val broccoli=Ingridients("Broccoli",R.drawable.brocolli)
        val chili=Ingridients("Chili",R.drawable.chilli)
        val corn=Ingridients(" Corn",R.drawable.corn)
        val carrot=Ingridients("Carrot",R.drawable.carrot)
        val lemon=Ingridients("Brocoli", R.drawable.lemon)
        val greens=Ingridients("Greens", R.drawable.leaf)
        ingridientsList.add(broccoli)
        ingridientsList.add(chili)
        ingridientsList.add(corn)
        ingridientsList.add(carrot)
        ingridientsList.add(lemon)
        ingridientsList.add(greens)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainpage)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}