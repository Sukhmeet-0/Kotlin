fun main() {
//    MyClass.MyObject.f()

    //using companion keyword it is similar to static keyword in java
    
    MyClass.f()
}
class MyClass{
    companion object MyObject{
        fun f(){
            println("Hi i am function")
        }
    }
}
