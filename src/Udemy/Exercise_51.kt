import kotlin.random.Random

/**
 * A lottery returns prizes. It can either return a car, a vacation or a gift card.
 * A function lottery returns prizes every time it is called. It will randomly return one of the three types of prizes.
 * Print out a specific message for each type of prize won.
 */

sealed class Prize
sealed class RoyalCar : Prize()
sealed class Vacation : Prize()
sealed class GiftCard : Prize()

class BMW:RoyalCar()
class EuropeTrip:Vacation()
class AmazonCoupon:GiftCard()

fun lottery() : Prize{
    val n=Random.nextInt(1,4)
    return when(n){
        1->BMW()
        2->EuropeTrip()
        else->AmazonCoupon()
    }
}
fun main(args: Array<String>) {
    for(i in 1..10){
        val luckyPrize = lottery()
        if(luckyPrize is BMW){
            println("You win bmw")
        }else if(luckyPrize is EuropeTrip){
            println("you win vaccation")
        }else{
            println("you win gift card")
        }
    }


}
