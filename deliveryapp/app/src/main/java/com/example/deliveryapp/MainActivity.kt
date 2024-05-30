package com.example.deliveryapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.deliveryapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var catagoriesList: ArrayList<Catagories>
    private lateinit var dishesList: ArrayList<Dishes>
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val catagoriesList=ArrayList<Catagories>()
        val dishesList=ArrayList<Dishes>()
        val burger=Catagories("Burger",R.drawable.burger)
        val pizza=Catagories("Pizza",R.drawable.pizza)
        val sandwiches=Catagories("Sandwich",R.drawable.sandwiches)
        val salad=Catagories("Salad",R.drawable.salad)
        catagoriesList.add(burger)
        catagoriesList.add(pizza)
        catagoriesList.add(salad)
        catagoriesList.add(sandwiches)
        binding.recyclercatagories.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val catagoriesAdapter=CatagoriesAdapter(catagoriesList)
        binding.recyclercatagories.adapter=catagoriesAdapter
        val friedShripm=Dishes(R.drawable.plate,"Fried Shrimp","4.8(163)",R.drawable.star,"20min",R.drawable.stopwatchstart,"$29.00")
        val friedShripm1=Dishes(R.drawable.newdish,"Fried Shrimp","4.8(163)",R.drawable.star,"20min",R.drawable.stopwatchstart,"$29.00")
        val friedShripm2=Dishes(R.drawable.plate,"Fried Shrimp","4.8(163)",R.drawable.star,"20min",R.drawable.stopwatchstart,"$29.00")
        val friedShripm3=Dishes(R.drawable.newdish,"Fried Shrimp","4.8(163)",R.drawable.star,"20min",R.drawable.stopwatchstart,"$29.00")
        dishesList.add(friedShripm)
        dishesList.add(friedShripm1)
        dishesList.add(friedShripm2)
        dishesList.add(friedShripm3)
        binding.recyclerDish.layoutManager=GridLayoutManager(this,2)
        val dishesAdapter=DishesAdapter(dishesList)
        binding.recyclerDish.adapter=dishesAdapter
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainpage)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}