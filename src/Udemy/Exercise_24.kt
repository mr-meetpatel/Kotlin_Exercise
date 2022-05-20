/**
 * You have a set of usernames
 * val usernames = hashSetOf(“john”, “bob”, “alice”)
 * Ask the user to choose their username. If their username is taken, print out a message and ask again.
 * Add the username to the set.
 */
fun main(args: Array<String>) {
    var userNameList = hashSetOf("meet","jay","mihir")
    var stop=false
    do{
        println("Enter Username:")
        var name= readLine()?:""
        name=name.toLowerCase()
        if(name in userNameList)
            println("$name Already Added...")
        else{

            println("$name Added...")
            userNameList.add(name)
            stop=true
        }
    } while (!stop)
    println(userNameList)
}
