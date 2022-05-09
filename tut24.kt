fun main() {
    val gender:String="Male"//"female,"others"

    val gender2:String?=null

    if(gender2!=null){
        println(gender2.toUpperCase())
    }
    println(gender2?.toUpperCase())
    gender2?.let {
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it")

    }
//    gender.let {  }

    var selectedValue=gender2?:"NA"
}