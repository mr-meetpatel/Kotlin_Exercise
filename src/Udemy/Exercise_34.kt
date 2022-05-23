/**
 * A class Job has three variables, name, revenue and salary, and two methods,
 * work - which increases revenue by the amount in salary
 * study - which increases salary
 * Two classes, Engineer and Doctor inherit from the Job class, but have different values for salary.
 * Create objects and call the functions a few times, printing out messages to see the result of the functions.
 */

open class Job{
    open var jobName=""
    open var revenue=0
    open var salary=0

    fun work(){
        revenue+=salary
        println("Revenue for $jobName is $revenue")
    }

    fun study(by:Int){
        salary+=by
    }
}

class Engineer:Job(){
    override var jobName="Engineer"


}

class Doctor:Job(){
    override var jobName="Doctor"
}
fun main(args: Array<String>) {
    var engineer=Engineer()
    var doctor=Doctor()
    engineer.salary=80000
    doctor.salary=50000
    engineer.study(20000)
    engineer.work()
    doctor.study(10000)
    doctor.work()



}


