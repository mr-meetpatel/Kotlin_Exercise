/**
 * Ask the user for a number.

Print out a square matrix of the size indicated by the number.

Inside each cell, print out 1 emoji

emoji 1 If the row*column is divisible by 3
emoji 2 If the row*column % 3 is 1
emoji 3 If the row*column % 3 is 2
 */

fun main(args: Array<String>) {
    val matrixSize=5
    for(i in 1..matrixSize){
        for (j in 1..matrixSize)
            when((i*j)%3){
                0->print("\uD83D\uDE00\t")
                1->print("\uD83D\uDE31\t")
                2->print("\uD83E\uDD00\t")
            }
        println()
    }


}
