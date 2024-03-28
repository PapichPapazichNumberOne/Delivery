package com.example.myapplication
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun <Product> ProductList(products: List<Product>, onItemClick: (com.example.myapplication.Product) -> Unit) {
    Column {
        products.forEach { product ->
            ProductListItem(product = product as com.example.myapplication.Product, onItemClick = onItemClick)
        }
    }
}


@Composable
fun ProductListItem(product: Product, onItemClick: (Product) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(product) }
            .padding(8.dp)
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = product.imageResId.toInt()),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = product.name,
                style = TextStyle.Default,
                        onTextLayout = null
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "$${product.price}",
                style = TextStyle.Default,
                onTextLayout = null
            )
        }
    }
}

@Composable
fun CategoryListItem(category: Category, onItemClick: (Category) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(category) }
            .padding(8.dp)
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = category.imageResId),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = category.name,
                style = TextStyle.Default,
                onTextLayout = null
            )
        }
    }
}

@Composable
fun CartItemRow(cartItem: CartItem) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = cartItem.product.name,
                style = TextStyle.Default,
                onTextLayout = null
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Quantity: ${cartItem.quantity}",
                style = TextStyle.Default,
                onTextLayout = null
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Price: $${cartItem.product.price * cartItem.quantity}",
                style = TextStyle.Default,
                onTextLayout = null
            )
        }
    }
}
