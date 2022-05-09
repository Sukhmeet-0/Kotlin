fun main() {
 val circle=Circcle(4.0)
    println(circle.area())
    circle.drag()
    if(circle is Circcle){
        println("THis is circle")
    }
    else{
        println("Bye Bye")
    }


}
interface Draggable{
    fun drag()
}
abstract class Shhape:Draggable{
    abstract fun area():Double
}
class Circcle(val radius:Double): Shhape() {
    override fun area():Double{
        return Math.PI*radius*radius
    }
    override fun drag(){
        println("Dragging Circle")
    }
}
