//fun main() {
//    val arr= arrayOf(1,2,3)
//    try {
//    println(arr[5])
//    }
//    catch (e:java.lang.Exception){
//        println("Please check array index")
////        println("Not executed")
//    }
//    catch (e:NullPointerException){
//        println(e)
//    }
//    finally {
//        println(arr[2])
//    }
//}
import java.lang.Exception;

fun main() {
    createUserList(5)
    createUserList(-4)
}

fun createUserList(count:Int){
    if(count<0){
//        throw illegalArguementException ("Count must be greater than zero")
        throw Exception("Count must be greater than 0")
    }
    else{
        println("User list contain $count users")
    }
}