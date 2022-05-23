/**
 * Create a function that asks the user for a name until an empty string is introduced.
 * Create a local function that takes a name and prints a greeting.
 * For each name introduced, print out a greeting.
 */

fun main() {
 greeting()
}

fun greeting(){
    fun greet(name:String){
        println("Hello $name have a nice day")
    }
    while(true){
        print("Enter your name : ")
        val name= readLine()?:""
        if(name!="")
            greet(name)
        else
            break

    }
}