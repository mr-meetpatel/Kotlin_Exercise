package Udemy

/**
 * A client has purchased a number of products that have a certain price
 * Print out the total amount that the client needs to pay
 * client name : mary
 * product quantity : 3
 * per product price :30
 */
fun main(args: Array<String>) {
    val clientName = "Mary"
    val productQuantity=3
    val productPrice=30
    print("Hello $clientName you need pay ${productQuantity * productPrice}")
}