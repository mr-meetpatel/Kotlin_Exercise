/**
 * Ask a user to input their age.
 * If they are under 13, they are a child.
 * If they are under 18, they are a teen.
 * If they are older, they are an adult.
 * Use ranges to print out the correct message.
 * If the age is 0, convert it to 1.
 */

fun main(args: Array<String>) {
    print("Enter Your Age : ")
    var age= readLine()?.toInt()?:0
    if (age==0) age+=1
    val res = if (age in 1..12)
                "Child"
              else if (age in 13..17)
                "Teen"
              else
                "Adult"
    println("You are $res")
}