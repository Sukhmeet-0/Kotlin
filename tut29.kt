fun main() {
    val n= listOf(1,2,3,4,5)
    val list=n.filter({it%2!=0})
    println(list)

    val listt=n.map{it*it}
    println(listt)

    n.forEach{(println(it))}
}
//fun isOdd(a:Int):Boolean{
//    return a %2!=0
//}