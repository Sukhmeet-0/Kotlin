fun main() {
    val number=10
//    val result =number in 1..11
    val result =number in 1 until 10//10 not included
    println(result)

    val animal="dog"
//    if(animal=="horse"){
//        println("Animal is horse")
//    }
//    else if(animal=="cat"){
//        println("Animal is cat")
//    }
//    else{
//        println("Animal is "+animal)
//    }



    
    //when is similar to switch statement
    when(animal){
        "horse"-> println("Animal is horse")
        "dog"->println("Animal is dog")
    }
}