fun main() {
    println("Hello cheesy code".formattedString())
    calculateTIme {
    loop(1000000)
    }
}
fun String.formattedString():String{
    return "-------------------$this---------------------"
}
//inline function is used to reduce its objects created and performance enhancement
inline fun calculateTIme(fn:()->Unit){
    val start=System.currentTimeMillis()
    fn()
    val end=System.currentTimeMillis()
    println("Time taken ${end-start} ms")
}
fun loop(n:Long){
    for (i in 1..n){

    }
}
