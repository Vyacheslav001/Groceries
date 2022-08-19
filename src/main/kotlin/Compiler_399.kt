data class Pizza(val name: String, val pricePerSlice: Double, val quantity: Int)

fun main() {
    val ints = listOf(1, 2, 3, 4, 5)

    val pizzas = listOf(
        Pizza("Sunny Chicken", 4.5, 4),
        Pizza("Goat and Nut", 4.0, 1),
        Pizza("Tropical", 3.0, 2),
        Pizza("The Garden", 3.5, 3)
    )

//    val minInt = ints.minBy({it.value})
    val minInt2 = ints.minBy({ int: Int -> int })
    val sumInts = ints.sum()
    val sumInts2 = ints.sumBy { it }
//    val sumInts3 = ints.sumByDouble({ number: Double -> number })
    val sumInts4 = ints.sumByDouble({ int: Int -> int.toDouble() })

//    val lowPrice = pizzas.min()
    val lowPrice = pizzas.minBy { it.pricePerSlice }
    val highQuantity = pizzas.maxBy { p: Pizza -> p.quantity }
    val highQuantity3 = pizzas.maxBy { it.quantity }
//    val totalPrice = pizzas.sumBy { it.pricePerSlice * it.quantity }
    val totalPrice2 = pizzas.sumByDouble { it.pricePerSlice * it.quantity }
}

/*
1 + НЕВЕРНО
2 +
3 +
4 +
5 + НЕВЕРНО
6 +

7 -
8 +
9 +
10 +
11 -
12 +
 */