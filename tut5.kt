fun main() {
    val isRaining=true
    if(isRaining){
        println("Take your umbrella")
    }
//    else if{}
    else{
        println("GO on")
    }

    //------------------------

    val x=9;val y=10
    val result=if(x>y){
        "X is greater"
    }
    else if(y>x){
        "Y is greater"
    }
    else{
        "They are equal"
    }
    println(result)
}
