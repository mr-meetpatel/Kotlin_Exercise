/**
 * A table allows the user to adjust the height and size, through a function
 * that also takes the parameters height and size.
 * Create the class, variable, function, instantiate it and call the function to adjust height and size.
 */
 class Table{
    var height=0.0
    var size=0
    fun setData(height:Double,size:Int){
        this.height=height
        this.size=size
    }
    fun showData(){
        println("Table Height : $height Size : $size")
    }
}

fun main(args: Array<String>) {
    val t1=Table()
    val t2=Table()
    t1.setData(12.5,10)
    t1.showData()
    t2.setData(13.55,15)
    t2.showData()
}