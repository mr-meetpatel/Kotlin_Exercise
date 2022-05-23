/**
 * Create an abstract class Shape that defines a method getArea which takes an argument size. Create two subclasses, Square and Circle, that inherit from Shape, and implement the method.
 * Square area = size * size
 * Circle area = size * size * 3.1415
 * Create another class Geometry that takes a generic argument of type Shape, and has a method that prints a message which includes the area of the shape that is passed.
 * Instantiate the Geometry class and print the area of the shape.
 */
abstract class Shape{
    abstract fun area(n:Int):Double
}

class Square:Shape(){
    override fun area(n: Int): Double {
     return (n*n).toDouble()
    }
}

class Circle:Shape(){
    override fun area(n: Int): Double = (3.14*n*n)

    }

class Geometery<T:Shape>{
    fun printAnswer(a:T,n:Int,shapeName:String)= println("Area of $shapeName is ${a.area(n)}")
}
fun main(args: Array<String>) {
    val circle =Geometery<Shape>()
    circle.printAnswer(Circle(),10,"Circle")
    val square=Geometery<Shape>()
    square.printAnswer(Square(),12,"Square")


}
