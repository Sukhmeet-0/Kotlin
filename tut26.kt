fun main() {
//    val nums= listOf(1,2,3)
//    println(nums.indexOf(2))
//    println(nums.indexOf(4))
//
//    val n= mutableListOf(1,2,3)
//    n.add(12)
//    println(n[3])
//    n.addAll(nums)
//
//
    val students = mutableMapOf<Int,String>()
    students.put(1,"Sukhmeet")
    students.put(2,"harmeet")
    println(students.get(2))
    println(students.get(22))

    for((key,values)in students){
        println("$key - $values")
    }

    //same goes for immutable map
    val s= mapOf<Int,String>(1 to "SUkhmeet",2 to "Harmeet")
}