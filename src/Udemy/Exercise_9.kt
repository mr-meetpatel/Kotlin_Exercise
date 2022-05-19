/**
 * Read a number from the console and convert it to Double.
 * Multiply it by 7, and convert the result into a string.
 * Print the length of that string to the console.
 */

fun main(args: Array<String>) {
    var d= readLine()
    var x= d?.toDouble()?.times(7)
    println(x?.toString()?.length)


}