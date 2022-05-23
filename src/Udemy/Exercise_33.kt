/**
 * Create a calculator class. It should have
 * A variable that stores the total.
 * A function that adds a number to the total.
 * A function that subtracts a number from the total.
 * A function that multiplies the total by an amount.
 * A function that divides the total by an amount.
 * A function that resets the total to 0.
 * Create an object, test out the functions and print out some results.
 */

 class Calulator{
    var total=0
    fun add(add:Int){
        print("After Adding $add to $total : ")
        total+=add
        println("$total")
    }

    fun sub(sub:Int){
        print("After Subtracting $sub from $total : ")
        total-=sub
        println("$total")
    }

    fun mul(mul:Int){
        print("After Multiplying $mul to $total : ")
        total*=mul
        println("$total")
    }

    fun div(div:Int){
        print("After Dividing $div to $total : ")
        total/=div
        println("$total")
    }

    fun reset(){
        total=0
        println("total : $total")
    }
}

fun main(args: Array<String>) {
    val calulator=Calulator()
    calulator.add(100)
    calulator.sub(10)
    calulator.mul(4)
    calulator.div(2)
    calulator.reset()


}

