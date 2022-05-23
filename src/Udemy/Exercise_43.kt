/**
 * Read client names from the console until the word stop is introduced. If the string is empty, the client is null.
 * Print out a hello message for each client.
 */

fun main(args: Array<String>) {
    var clientName= arrayListOf<String>()
    var stop=false
    while(!stop){
        println("Enter Name : ")
        var name= readLine()?:""
        name.let {
            if(it.toUpperCase()=="STOP"){
                stop=true
            }else{
                if(it==""){
                    clientName.add("null")
                    println("Hello null")
                }
                else{
                    clientName.add(name)
                    println("Hello $name")
                }
            }

        }

    }
}
