/**
 * Ask the user to input a large integer.
 * Print out all the numbers that are divisible by 7, that are less than the user’s number.
 */
fun main(args: Array<String>) {
    print("Enter Number : ")
    val n= readLine()?:""
    var i=1
    while(i < n.toInt()){
        if(i%7==0){

            println(i)
        }
        i++
    }

}