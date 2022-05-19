/**
 *A product costs 29.99.
 *Ask a user at the console how many products they want to buy.
 * If the read value is null, use the default of one.
 * Print the total of the purchase.
 */

fun main(args: Array<String>) {
    val productCost=29.99f
    print("How many product do you want to buy : ")
    var n = readLine()
    var total =n?.toInt()?:1
    println("Total Price : ${total * productCost}")

}