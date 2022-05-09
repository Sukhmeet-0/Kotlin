fun main() {
val p1=Person(1,"John")
val p2=Person(1,"Sohn")
    println(p1)//toString
    println(p2)
    println(p1.hashCode())
    println(p1==p2)
    val p3=p1.copy(id=3)
    println(p3)
    println(p1.component1())
    println(p1.component2())
}
data class Person(val id:Int, val name:String){

}