package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class CartActivity : ComponentActivity() {
    private val viewModel: CartViewModel = CartViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartScreen(viewModel)
        }
    }
}

@Composable
fun CartScreen(viewModel: CartViewModel) {
    val cartItems by viewModel.cartItems
    val totalCost by viewModel.totalCost

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        CartItemList(cartItems)

        Spacer(modifier = Modifier.height(16.dp))


        Text(text = "Total Cost: $totalCost", modifier = Modifier.fillMaxWidth())
    }
}
