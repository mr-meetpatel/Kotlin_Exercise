/**
 * A famous fast food restaurant has a secret formula for their burgers.
 * A franchise of this brand can sell burgers, but does not have access to the formula.
 * They have to ask the original restaurant how to prepare the food.
 * Implement this in a program, and call the franchise object to provide you with burgers.
 */

open class Restaurant{
    protected fun applySecretFormula():String{
        return "your dish is ready"
    }
}

class Franchise : Restaurant(){
    fun preparingYourBurger(){
        println("Preparing your Burger please wait...")
        println(applySecretFormula())
    }
}

fun main() {
    var f1=Franchise()
    f1.preparingYourBurger()
}
