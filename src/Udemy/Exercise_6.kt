/**
 * Ask the user to input a number of type double.
 * Multiply it by pi
 * var pi = 4.14159
 * Print the type of the resulting variable.
 * Print the result.
 */

fun main(args: Array<String>) {
    println("Enter Number : ")
    var num= readLine()?:""
    val pi=3.14
    var ans=num.toDouble()*pi
    println("Answer : ${ans} and Type : ${ans::class.java}")
}