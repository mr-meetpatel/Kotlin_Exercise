/**
 * Ask the user to input their name.
 * Based on the first letter of their name, print out a personalised greeting
 * for the first 3 letters of the alphabet,
 * a different one for the next 3 letters,
 * and a third message for the rest
 */

fun main(args: Array<String>) {
    println("Enter Name:")
    val name = readLine()?:""
    when(name[0]){
        in 'A'..'C' -> println("Hi $name have a nice day")
        in 'D'..'F' -> println("Hi $name hope you have a great day")
        else-> println("Hi $name good bye")
    }

}
