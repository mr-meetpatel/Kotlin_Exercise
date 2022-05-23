/**
 * Whenever a car is built, the company logs must be updated and the police notified.
 * Implement this functionality in a program.
 */

class Car{
    fun buildingCarProcess() {
        println("Building Car...")
    }
}

fun main() {
    Car().apply {
        buildingCarProcess()
    }.also {
        println("log :- Car is in building process.")
        print("Message send to police")
    }
}