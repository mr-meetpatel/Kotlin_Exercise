/**
 * A class Father has a first name and last name. It also has a function that prints out the person’s name.
 * A class Son inherits from Father and overrides the first name. It also overrides the message function, which now prints out both the name of the person, and the name of the father.
 * Implement this structure in a program.
 */

open class Father{
    open val firstName="Mitesh"
    val lastName="Patel"
    open fun printFullName(){
        println("My Name : $firstName $lastName")
    }
}

class Son : Father(){
    override val firstName="Meet"
    override fun printFullName() {
        super.printFullName()
        println("Father Name :${super.firstName} ${super.lastName}")
    }
}

fun main(args: Array<String>) {
    val son=Son()
    son.printFullName()
}