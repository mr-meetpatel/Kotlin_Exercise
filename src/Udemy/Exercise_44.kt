/**
 *A store has a supply of shoes, shirts and jackets, as well as a method to print out the inventory.
 *Create a variable of type store, update its stock and print out the inventory.
 */

class Store{
    var shoes=0
    var shirts=0
    var jackets=0

    fun printAll(){
        println("Shoes : $shoes\nShirts : $shirts\nJackets : $jackets")
    }
}

fun main(args: Array<String>) {
    with(Store()){
        shoes=10
        jackets=50
        shirts=15
        printAll()
    }
}