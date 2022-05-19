/**
 * Read from the console the amount the user has in their bank account.
 * The interest on that account is 5.5% per year.
 * How much would that user have in 5 years?
 */

fun main(args: Array<String>) {
    println("Enter your Bank balance : ")
    var p=readLine()?:""
    var r=5.5f
    var t=5
    val si = (p.toInt()*r*t)/100
    println(si)
}