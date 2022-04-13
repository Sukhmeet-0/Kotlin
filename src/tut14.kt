class Personn(name:String,age:Int){
    var name:String=name
        get() {
            return field.toUpperCase()
        }
    var age:Int=age
    set(value) {
        if (value>0){
            field=value
        }
        else{
            println("age cant be negative")
        }
    }
}
fun main() {
//    val ob=tut14()
//    println(ob.add(3,4))
//    println(ob.mulitply(3,4))


    val p1=Personn("Sam",20)
    p1.age=-21
    println(p1.name)
    println(p1.age)
}
//class tut14 {
//    lateinit var message:String
//    fun add(a:Int,b:Int):Int{
//        return a+b
//    }
//    fun mulitply(a:Int,b:Int):Int{
//        return a*b
//    }
//}

