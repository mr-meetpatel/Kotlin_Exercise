/**
 * Create a class that takes a generic type T, and has a function that converts the type to String and prints a message that includes the argument passed.
 * Instantiate the class with different types and call the function.
 */


class ChangeType<T> {
    fun changeType(str: T): String {
        return str.toString()
    }
}

fun main(args: Array<String>) {
    val ct1 = ChangeType<Int>()
    val ct2 = ChangeType<Float>()

    println("${ct1.changeType(100)} Type: ${ct1.changeType(100)::class.java}")
    println("${ct2.changeType(10.1f)} Type: ${ct2.changeType(10.1f)::class.java}")

}