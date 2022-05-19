/**
 * You manage an amusement park, and you have a map that stores dates and attendance.
 * var attendance = hashMapOf(Pair(“23 Sept”, 2837), Pair(“24 Sept”, 3726), Pair(“25 Sept”, 6253))
 * Add a value for 26 Sept.
 * How many people attended in total on 25 and 26 Sept?
 * Is data for 22 Sept available?
 */

fun main(args: Array<String>) {
    var att= hashMapOf(Pair("23 Sept",2837),Pair("24 Sept",3726),Pair("25 Sept",6253))
    att["26 Sept"]=1000
    val n1=att["26 Sept"]?:0
    val n2=att["25 Sept"]?:0
    println("Total Attendance on 25 and 26 is ${n1+n2}")
}
