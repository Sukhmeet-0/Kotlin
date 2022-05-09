fun main() {
    val o=Outer()
//    val n=Outer.Nested()
    val i=Outer().Nested()
    i.test()
}
class Outer{
    var i=0
    //nested class can only access outer class variables and methods with inner keyword
    inner class Nested{
        fun test(){
            println("Hi i am nested class $i")
        }
    }
}