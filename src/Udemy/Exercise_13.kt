/**
 * A zoo has a list of animals.
 * val animals = arrayListOf(“lion”, “zebra”, “chimp”, “elephant”)
 * A new panda bear cub has arrived.
 * Print out the new list of animals.
 * The lion has been sold to a different zoo.
 * Print out the new list of animals.
 * Does the zoo have both elephants and giraffe
 */

fun main(args: Array<String>) {
    var animalsAvailable= arrayListOf("lion","zebra","chimp","elephant")
    animalsAvailable.addAll(listOf("panda","bear"))
    println("After Adding Panda and Bear $animalsAvailable")
    animalsAvailable.remove("lion")
    println("After Selling Loin $animalsAvailable")
    println("Does the zoo have both elephants and giraffe : ${animalsAvailable.containsAll(listOf("elephant","giraffe"))}")
    
}
