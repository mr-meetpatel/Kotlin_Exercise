/**
 * A customer will tell the program what product they want to buy.
 * Then, they will tell the program how many products they require.
 * Assume the price of the product is 9.99
 * What is the total?
 * Handle any exceptions that might occur.
 */

fun main(args: Array<String>) {
    println("Enter product you want buy")
    var product= readLine()
    println("How many you want to buy")
    var n= readLine()
    try {
        var price =n?.toInt()
        println("$product : ${price?.times(99)}")
    }catch (e:Exception){
        println("Exception Occur ${e.localizedMessage}")
    }
}