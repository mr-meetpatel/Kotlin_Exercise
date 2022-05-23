import java.text.FieldPosition

/**
 * The medals in the olympics are
 * GOLD - 1st place
 * SILVER - 2nd place
 * BRONZE - 3rd place
 * NONE - other
 * Create a class Olympics that has a function which returns the medal a contestant won based on the position they finished on.
 * It also has a function which returns the position of a contestant
 */

enum class Medal(val position: Int){
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4)
}

class Olympic{
    fun getMedal(position: Int):Medal{
        return when(position){
            1->Medal.GOLD
            2->Medal.SILVER
            3->Medal.BRONZE
            else->Medal.NONE
        }
    }
    fun getPosition(medal: Medal):Int{
        return medal.position
    }
}

fun main(args: Array<String>) {
    val game =Olympic()
    println(game.getMedal(1))
    println(game.getMedal(2))
    println(game.getPosition(Medal.BRONZE))
    println(game.getPosition(Medal.NONE))
}

