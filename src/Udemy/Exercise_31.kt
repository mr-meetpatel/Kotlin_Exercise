/**
 * Create a Higher Order Function that takes a list of client names and a lambda expression that returns a String.
 * It then applies the lambda expression to every client name, creates a new collection of the results and returns the result.
 * Create a lambda expression that takes a client name String and returns a personalised message.
 * Call the HOF and print out the result.
 */
fun main(args: Array<String>) {
    val clientNames= arrayListOf("Meet","Ronak","Mihir")
    val getMsg=getGreeting(clientNames){name->"Hello $name"}
    println(clientNames)
    println(getMsg)
}
fun getGreeting(clientNames:ArrayList<String>,msg:(String)->String):ArrayList<String>{
val mess= arrayListOf<String>()
    for(cn in clientNames){
        mess.add(msg(cn))
    }
    return mess

}
