/**
 *Ask the user to input a year. For each month of that year, print out how many days there are.
 * Make sure you count leap years.
 * Assume a leap year is a year that is divisible by 4.
 */
fun main(args: Array<String>) {
    println("Enter Year : ")
    val year= readLine()?:""
    for(i in 1..12){
        val res=when(i){
            1->"Jan : 31 days"
            2->if(year.toInt()%4!=0) "Feb : 28 days" else "Feb : 29 days"
            3->"Mar : 31 days"
            4->"Apr : 30 days"
            5->"May : 31 days"
            6->"Jun : 30 days"
            7->"Jul : 31 days"
            8->"Aug : 31 days"
            9->"Sep : 30 days"
            10->"Oct : 31 days"
            11->"Nov : 30 days"
            12->"Dec : 31 days"
            else -> ""
        }
        println(res)
    }
    print("\uD83D\uDE00")
}