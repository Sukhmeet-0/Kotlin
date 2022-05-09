fun main() {
    val day=Day.SUNDAY
    println(day)
    println(day.n)
    for(i in Day.values()){
        println(i)
        day.printFormattedDay()
    }




//    val tile=Red("Mushroom",25)
    val tile:Tile=Red("Mushroom",25)
    val points=when(tile){
        is Red->tile.point*2
        is Blue->tile.point*5

    }
    println(points)
//    val tile2=Blue("FIre",30)
//    println("${tile.point} - ${tile.type}")
}
enum class Day(val n:Int){
    MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
    fun printFormattedDay(){
        println("Day is $this")
    }

}
sealed class Tile
class Red(val type:String,val point:Int):Tile()
class Blue(val type:String,val point:Int): Tile()