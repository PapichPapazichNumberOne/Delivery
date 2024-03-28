package com.example.myapplication

class ProductRepository {
    fun getProductsForCategory(category: String): List<Product> {

        return when (category) {
            "Готовая еда" -> listOf(
                Product("Пицца", R.drawable.pizza, 9.99),
                Product("Суши", R.drawable.sushi, 12.99),
                Product("Бургер", R.drawable.burger, 8.99)
            )
            "Молочная продукция" -> listOf(
                Product("Молоко", R.drawable.milk, 1.99),
                Product("Сыр", R.drawable.cheese, 3.99),
                Product("Йогурт", R.drawable.yogurt, 2.49)
            )
            "Напитки" -> listOf(
                Product("Cola", R.drawable.Colo, 1.99),
                Product("Sprite", R.drawable.Colo, 3.99),
                Product("Fanta", R.drawable.Colo, 2.49)
            )
            "Выпечка" -> listOf(
                Product("Sosiska Testa", R.drawable.bakery, 1.99),
                Product("Kryasan", R.drawable.bakery, 3.99),
                Product("Byblik", R.drawable.bakery, 2.49)
            )
            "Овощи и фрукты" -> listOf(
                Product("Яблоко", R.drawable.vegetables_fruits, 1.99),
                Product("Морковка", R.drawable.vegetables_fruits, 3.99),
                Product("Лук", R.drawable.vegetables_fruits, 2.49)
            )
            "Мясо и рыба" -> listOf(
                Product("Фуга", R.drawable.meat_fish, 1.99),
                Product("Баранина", R.drawable.meat_fish, 3.99),
                Product("Конина", R.drawable.meat_fish, 2.49)
            )


            else -> emptyList()
        }
    }
}
