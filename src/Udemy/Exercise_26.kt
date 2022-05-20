/**
 * Design a function that asks for a user’s name. Then it asks for a user’s birth year.
 * Finally, it prints out a message saying the user’s name and age.
 * Call the function 3 times.
 */
fun main(args: Array<String>) {
    for(i in 1..3)
        nameAndAge()
}

fun nameAndAge() {
    print("Enter Name:")
    val name= readLine()?:""
    print("Enter birth year:")
    val year= readLine()?:""
    println("Hii $name your age is ${2022-year.toInt()}")

}
