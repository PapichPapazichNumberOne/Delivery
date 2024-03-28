package com.example.myapplication

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class HomeActivity : ComponentActivity() {
    private val viewModel: HomeViewModel = HomeViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen(viewModel)
        }
    }
}

@Composable
fun HomeScreen(viewModel: HomeViewModel) {
    val categories by viewModel.categories
    val selectedCategory by viewModel.selectedCategory
    val products by viewModel.products

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        CategoryList(categories) { category ->
            viewModel.fetchProductsForCategory(category)
        }

        Spacer(modifier = Modifier.height(16.dp))

        selectedCategory?.let { category ->
            ProductList<Any?>(products)
        }
    }
}
