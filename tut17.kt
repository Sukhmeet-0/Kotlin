open class Shape{
    open fun area():Double{
        return 0.0
    }
}
class Circle(val radius:Double):Shape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}class Square(val side:Double):Shape(){
    override fun area(): Double {
        return side*side
    }
}

fun main() {
val Circle:Shape=Circle(4.0)
val Square:Shape=Square(4.0)

//    or

//    val Circle:Circle=Circle(4.0)
//val Square:Square=Square(4.0)
    println(Circle.area())
    println(Square.area())
}