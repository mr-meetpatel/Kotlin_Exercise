/**
 * Add a companion object function to the Double class that prints out the class name.
 * Call the companion object extension function.
 */

fun main(args: Array<String>) {
    print(Double.getClassName())
}

fun Double.Companion.getClassName():String{
    return "=> Double Class"
}