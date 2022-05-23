/**
 * A coffee shop serves cups of coffee. A cup of coffee has a client name and a method for preparing the coffee.
 * Read a client name from the console, then call the sellCoffee method of the coffee shop. Create a coffee cup object, initialise it and serve it to the client.
 */

class CoffeeShop{
    fun sellCoffee(name:String){
        CoffeeCup().apply{
            prepareCoffee()
            clientName=name
            println("Your coffee is ready $clientName...")
        }
    }
}

class CoffeeCup {
    var clientName=""
    fun prepareCoffee() {
        println("Preparing your coffee please wait...")
    }

}

fun main() {
    println("Enter Your Name: ")
    var name= readLine()?:""
    var cs=CoffeeShop()
    cs.sellCoffee(name)
}
