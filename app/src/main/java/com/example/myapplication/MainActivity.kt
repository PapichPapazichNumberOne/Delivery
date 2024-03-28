package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val products = listOf(
                Product("Product 1", 10.0, R.drawable.burger),
                Product("Product 2", 15.0, R.drawable.Colo),
                Product("Product 3", 20.0, R.drawable.bakery)
            )
            ProductList(products = products) {  }
        }
    }
}
