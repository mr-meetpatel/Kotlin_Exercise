/**
 * Have the user introduce 10 numbers.
 * Print a list that contains only odd numbers and make sure to exclude the numbers 3 and 13.
 */

fun main(args: Array<String>) {
    var numberList= arrayListOf<Int>()
    println("Enter 10 Number : ")
    for(i in 1..10){
        var n = readLine()?:""
        n?.toInt().takeIf { it % 2 !=0 }.
            takeUnless { it == 3 || it==13 }
            ?.let { numberList.add(it) }
    }
    println(numberList)
}
