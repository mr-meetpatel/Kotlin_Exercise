/**
 * You have a list of customers for your online store.
 * A new customer has joined.
 * Print the list of customers.
 * A customer has chosen to leave.
 * Print the list of customers.
 */

fun main(args: Array<String>) {
    var custList= hashSetOf("meet","jay","mihir")
    custList.add("bhavin")
    println("After adding new user : $custList")
    custList.remove("jay")
    println("After removing user : $custList")
}
