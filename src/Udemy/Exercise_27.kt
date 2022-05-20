/**
 * Create a function that receives the name of an animal, and returns the estimated lifespan.
 * cats -> 15
 * dogs -> 10
 * rabbit -> 12
 * everything else -> 20
 * Ask the user to input an animal, then print out the estimated lifespan for that animal.
 */
fun main(args: Array<String>) {
    print("Enter name of animal: ")
    var name= readLine()?:""
    print("$name has ${fetchLifeSpan(name)} years of lifespan")
}

fun fetchLifeSpan(name:String): Int {
    var lifeSpanData= hashMapOf(Pair("cat",15),Pair("dog",10),Pair("rabbit",12))
    if(name in lifeSpanData)
        return lifeSpanData[name]!!
    return 20
}
