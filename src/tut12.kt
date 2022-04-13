//class Car(val name:String,val type:String,val kmRan:Int){
//    fun driveCar(){
//    println("$name Car is driving")
//    }
//    fun applyBrakes(){
//    println("$name Applying brakes")
//    }
//}
fun main(){
//    val mustang=Car("mustang","petrol",100)
//    println(mustang.name)
//    println(mustang.type)
//    println(mustang.kmRan)
//    mustang.driveCar()
//    mustang.applyBrakes()
    var i:Int=20
    println(i.plus(30))
    val v1=Person("A",20)
    val v2=Person("B",17)
    println(v1.canVote())
    println(v2.canVote())
}
class Person(val name:String, val age:Int){
    fun canVote():Boolean{
        return age>18
    }

}