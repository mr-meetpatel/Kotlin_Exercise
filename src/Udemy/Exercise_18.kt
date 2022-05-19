/**
 * You are designing a grading system for school exams. The total for an exam is 100 points, and you need to convert that into a grade A to F.
 * Design a program that reads in a number that represents a student’s grade, from 1 to 100 and prints out a grade.
 * A -> 90 to 100
 * B -> 80 to 89
 * C -> 70 to 79
 * D -> 60 to 69
 * E -> 50 to 59
 * F -> everything else
 */
fun main(args: Array<String>) {
    val mark=45
    if(mark>100)
        println("Marks cannot be greater than 100")
    else{
        val grade=if(mark>=90){
            "A"
        }else if(mark>=80){
            "B"
        }else if(mark>=70){
            "C"
        }else if(mark>=60){
            "D"
        }else if(mark>=50){
            "E"
        }else{
            "F"
        }
        println("Grade : $grade")
    }

}
