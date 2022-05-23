/**
 * An object of a class NewUser is created for each new user. It contains a function to print a welcome message.
 * In your program, you have a list of banned usernames.
 * Ask the user to input their desired username. If it is not part of the list, create the NewUser object and print the welcome message.
 */

fun main(args: Array<String>) {
    val newUser by lazy { NewUser() }
    val banUser= arrayListOf<String>("Mihir","Preet")
    print("Enter Name : ")
    val name= readLine()?:""
    if(!banUser.contains(name)){
        newUser.printWelcomeMessage(name)
    }else{
        println("Sorry $name you can't access this course")
    }
}

class NewUser {
    fun printWelcomeMessage(name: String) {
        println("$name Welcome to my course")
    }

}
