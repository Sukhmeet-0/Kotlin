fun main() {
println(Aa.num)
    B.test()
    println(B.p)
    var test=object{
        val x=10
        fun method(){
            println("I am test object")
        }
    }
    test.method()
    var tt=object:c{
        override fun clone(){
            println("I am clonning")
        }
    }
    tt.clone()
}
object Aa{
    val num=29
}
object B{
    val p=3
    fun test(){
        println("I am object B")
    }

}
interface c{
    fun clone()
}