fun add(num1:Int,num2:Int):Int=num1+num2

//}fun add(num1:Int,num2:Int):Int{
//    val sum=num1+num2
//    println(sum)
//    return sum
//}
//in place of void in kotlin Unit is used
fun evenOrOdd(a:Int):Unit{
    val result=if(a%2==0)"Even" else "Odd"
    println(result)
}
//}fun add(num1:Int,num2:Int){
//    val sum=num1+num2
//    println(sum)
//}
fun main() {
    println("Welcome to Functions")
//    add(5, 6)
//    println(evenOrOdd(13))
    evenOrOdd(13)
    println(add(4,6))

    for(i in 1..5){
        println("Waheguru $i ")
    }
}