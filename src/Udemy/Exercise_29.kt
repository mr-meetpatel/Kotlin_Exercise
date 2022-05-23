/**
 * Create a function that takes a product name and price. It adds 20% tax to that product and displays a message saying how much the product costs.
 * Overload the function so that it takes a map of products and prices, and does the same thing.
 * Call both functions in your program.
 */
fun main(args: Array<String>) {
    helloClient(5,"Meet","Amesha","Jay")
}
fun helloClient(count:Int,vararg names:String){
    for(name in names){
        for(i in 1..count)
            print("Hello $name :")
        println()
    }
}

