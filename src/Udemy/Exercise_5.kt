/**
 * Ask the user to input a number and read it into a variable.
 * Convert it to an integer.
 * Multiply that value with a double variable that you created.
 * What is the type of the new variable?
 * Print it to the console.
 */

fun main(args: Array<String>) {
    print("Enter Number : ")
    var num= readLine()?:""
    var d=3.14
    var ans=num.toInt()*d
    println("Ans : $ans and Type : ${ans::class.java}")

}

