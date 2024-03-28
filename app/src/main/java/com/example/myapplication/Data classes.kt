package com.example.myapplication

data class Product(val name: String, val imageResId: Double, val price: Int)
data class Category(val name: String, val imageResId: Int)
data class CartItem(val product: Product, val quantity: Int)
