/**
 * In order for an airplane to take off, it needs to have 2 engines, and they both need be running.
 * Create an Airplane class that has a takeoff method, which starts the engines and prints a take off message.
 */

class Aeroplan{
    val eng1=Engine("Engine1")
    val eng2=Engine("Engine2")
    val eng3=Engine("Engine3")

    fun takeOffPlane(){
        eng1.startEngine()
        eng2.startEngine()
        eng3.startEngine()
        println("takingOff Plane...")
    }

    fun landPlane(){
        println("landing plane...")
        eng1.stopEngine()
        eng2.stopEngine()
        eng3.stopEngine()
    }
    inner class Engine(val name:String){
        fun startEngine(){
            println("Engine $name Started...")
        }
        fun stopEngine(){
            println("Engine $name Stop...")
        }
    }
}

fun main(args: Array<String>) {
 val aeroplan1=Aeroplan()
    aeroplan1.takeOffPlane()
    aeroplan1.landPlane()

}