/**
 * A TV can provide programs from a certain channel.
 * It can also provide channel and subtitle information.
 * It can also provide programs that were shown at a certain time of the day.
 * Implement this in a program and call the various methods.
 */

class TeleVision{
    fun getChannelInfo(id:Int){
        println("This Channel in running on $id")
    }
    fun getChannelInfo(id:Int,subtitle:Boolean){
        print("This Channel in running on $id and ")
        if(subtitle)
            println("subtitle is On")
        else
            println("subtitle is Off")
    }
    fun getChannelInfo(id:Int,time:String){
        print("This Channel in running on $id and time : $time")
    }
}

fun main(args: Array<String>) {
    var tv=TeleVision()
    tv.getChannelInfo(1)
    tv.getChannelInfo(1,true)
    tv.getChannelInfo(2,false)
    tv.getChannelInfo(1,"11:00 am")

}
