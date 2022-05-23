/**
 * The classes Cat and Dog inherit from an abstract class Animal. The Cat class has a function purr() and the Dog class has a function bark()
 * A function provides a list of animals, that are randomly distributed.
 * Design a program that invokes each respective function of each type of Animal from the list.
 */
abstract class Animal

class Dog : Animal() {
    fun bark() {
        println("barking...")
    }
}

class Cat : Animal() {
    fun purr() {
        println("purring...")
    }
}

fun main(args: Array<String>) {
    val animals= arrayListOf<Animal>(Dog(),Dog(),Cat(),Cat(),Dog())
    for (animal in animals){
        (animal as? Dog)?.bark()
        (animal as? Cat)?.purr()
    }
}
