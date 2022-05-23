/**
 * Create an online store user account class that has a userName and balance.
 * Create 3 constructors for this class.
 * Inside the constructors, based on the user balance, print out whether they can afford the product tshirt, which costs 20, and if so, how many can they afford.
 */
class OnlineStore{
    var userName:String ?= null
    var balance=0
    val tShirtPrice=20
    constructor(){
        userName="userName"
        balance=0
        isAffortable()
    }
    constructor(userName:String){
        this.userName=userName
        balance=20
        isAffortable()
    }

    constructor(userName: String,balance:Int){
        this.userName=userName
        this.balance=balance
        isAffortable()
    }


    fun isAffortable():Boolean{
        if(balance>=tShirtPrice)
            return true
        return false
    }
}

fun main(args: Array<String>) {
    val user1 =OnlineStore()
    user1.userName="User1"
    val user2=OnlineStore("User2")
    val user3=OnlineStore("User3",50)
    val users= listOf<OnlineStore>(user1,user2,user3)
    for(user in users)
        if(user.isAffortable())
            println("${user.userName} you can buy ${user.balance/user.tShirtPrice} tShirt from our store")
        else
            println("${user.userName} you can't buy tshirt from your store")




}


