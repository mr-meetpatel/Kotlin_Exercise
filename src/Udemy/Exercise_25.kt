/**
 * A group of young people are going to a nightclub.
 * Design a program that accepts user ages.
 * The program displays a welcome message for each user.
 * If it receives an age lower than 18, it prints a message that this client is not allowed.
 * If it receives the word “stop”, the program ends
 */
fun main(args: Array<String>) {
    while(true){
        print("Enter age : ")
        var age= readLine()?:""
        if(age.toLowerCase()=="stop")
            break
        if(age.toInt()<18){
            println("you are not allow...")
            continue
        }
        println("Welcome to your club")

    }
}