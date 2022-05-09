fun main() {
    var fn:(a:Int,b:Int)->Int=::sum
    val lambda1={x:Int,y:Int->x+y}
    val multiLineLambda={
        println("Hello lambda")
        val a=2+3
        "Hello cheezy code"
        2
    }

    val singleParam:(Int)->Int={x->x+x}
//    val ss(Int)->Int ={it+it}
    println(singleParam)
}
fun sum(a:Int,b:Int):Int=a+b
//we can  also pass lambda exp in parameters of higher order function in place of a function
fun calculator(a:Int,b:Int,op:(Int,Int)->Int):Int{
    return op(a,b)
}