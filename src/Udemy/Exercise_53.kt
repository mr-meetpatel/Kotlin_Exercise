/**
 * Add an extension function to the ArrayList class that returns a message saying how many elements the list contains.
 * Create an ArrayList and print out the extension function message.
 */

fun main(args: Array<String>) {
    val numbersList= arrayListOf<Int>(1,2,3,4,5)
    print(numbersList.getLenght())

}

fun ArrayList<Int>.getLenght()=size