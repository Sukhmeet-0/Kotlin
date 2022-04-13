fun main() {
    val a= arrayOf(1,2,3,4)
    val b= arrayOf<Int>(1,2,3,4)
    for   ((i,e)  in a.withIndex()){
        println("$i - $e")
    }
    println(a[1])
    println(a.get(3))
    a.set(0,13)
    println(a.get(0))
    println(a.size)
//    println(a[5])
}