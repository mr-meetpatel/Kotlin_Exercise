/**
 * A laptop has two functions, turnOn and turnOff.
 * To make sure it works as expected, every time we have a new laptop object, the protocol is to turn it off and then back on again.
 * Create a laptop object and implement the protocol.
 */

class Laptop{
    fun turnOn(){
        println("Laptop is Turing On")
    }

    fun turnOff(){
        println("Laptop is Turing Off")
    }
}

fun main(args: Array<String>) {
        Laptop().run {
            turnOn()
            turnOff()
        }
}