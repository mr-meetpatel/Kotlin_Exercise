/**
 *Create a program that asks a user’s birth year.
 *Then prints out the user’s estimated age
 */
fun main(args: Array<String>) {
    print("Enter your birth year : ")
    var y= readLine()?:""
    var age=2022 - y.toInt()
    println("Your age is $age")


}


