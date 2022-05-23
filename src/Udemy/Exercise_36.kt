/**
 * A bank has various rules for interest rates.
 * If a user has less than 1000 in their account, their interest rate is 1.0
 * If a user has less than 10,000 in their account, their interest rate is 0.5
 * If a user has 10000 and over, their interest rate is 0.2.
 * Implement this in a program, create an object, update the amount and print out the interest rate.
 */
class Bank{
    var interestRate=0.0
    var balance:Int=0
        get() = field
        set(newValue){
            if(newValue < 1000)
                interestRate=1.0
            else if(newValue <10000)
                interestRate=0.5
            else
                interestRate=0.2
            field=newValue

        }
}
fun main(args: Array<String>) {
    var a1=Bank()
    a1.balance=100
    println("Your balance :${a1.balance} Interest Rate :${a1.interestRate}")


}
