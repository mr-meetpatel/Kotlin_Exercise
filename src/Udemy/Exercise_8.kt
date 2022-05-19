/**
 * A farmer has 3 cows, of which only one produces milk
 * He has two children
 * He is trying to apply for funding. The requirements are
 * You must have no more than 5 animals
 * Animals must produce something that can be sold
 * Regardless of the other conditions, funding will be approved if the family has 3 or more members
 */
fun main(args: Array<String>) {
    val nCow=3
    val nMilkProduce=1
    val farmerChild=2
    println("Will farmer get the funding : ${((nCow<=5)&&(nMilkProduce>0)||(farmerChild+1>=3))}")
}