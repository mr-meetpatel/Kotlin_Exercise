import kotlin.random.Random

/**
 * Given a collection of random integers.
 * If a number is odd, double it.
 * If a number is even, half it.
 * Print out a subset of the collection that has numbers greater than 25.
 */

fun main(args: Array<String>) {
    val randomNumber= arrayListOf<Int>()
    for(i in 1..10){
        randomNumber.add(Random.nextInt(1,100))
    }
    val res=randomNumber.map {
        if (it % 2 ==0){
            it/2
        }else{
            it*2
        }
    }.filter{ it > 25}
    println(randomNumber)
    println(res)

}
