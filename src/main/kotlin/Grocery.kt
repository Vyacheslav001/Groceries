data class Grocery(val name: String, val category: String, val unit: String, val unitPrice: Double, val quantity: Int)

fun main() {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    val highestUnitPrice = groceries.maxBy { it.unitPrice * 5 }
    val highestUnitPriceOf = groceries.maxOf { it.unitPrice * 5 }
    println("highestUnitPrice: $highestUnitPrice")
    println("highestUnitPriceOf: $highestUnitPriceOf")
    val lowestQuantity = groceries.minBy { it.quantity }
    val lowestQuantityOf = groceries.minOf { it.quantity }
    println("lowestQuantity: $lowestQuantity")
    println("lowestQuantityOf: $lowestQuantityOf")

    val sumQuantity = groceries.sumBy { it.quantity }
    val sumQuantityOf = groceries.sumOf { it.quantity }
    println("sumQuantity: $sumQuantity")
    println("sumQuantityOf: $sumQuantityOf")
    val totalPrice = groceries.sumByDouble { it.quantity * it.unitPrice }
    val totalPriceOf = groceries.sumOf { it.quantity * it.unitPrice }
    println("totalPrice: $totalPrice")
    println("totalPriceOf: $totalPriceOf")

}