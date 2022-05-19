/**
 * Define two variables
 * val hasEggs = true
 * val hasBacon = false
 * A man goes to the market. His instructions are:
 * If you find eggs, buy 12
 * If you buy eggs, and you also find bacon, buy two packs
 * Eggs cost 5 each.
 * A pack of bacon costs 20.
 * How much does the man spend at the market?
 */

fun main(args: Array<String>) {
    val isEggs=true
    val isBacon=false
    val ePrice=5
    val bPrice=20
    var totalPrice=0
    if(isEggs){
        totalPrice+=ePrice*12
        if (isBacon){
            totalPrice+=bPrice*2
        }
    }
    println("Final Bill : $totalPrice")
}
