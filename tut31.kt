fun main() {
    val emp=Employee()
    emp.age=20
    emp.name="yaya"



    emp.apply {
        age=30
        name="John"
    }
    println(emp)
    emp.let {
        println(it.name)
        println(it.age)
    }
    with(emp){
        age=45
        name="haohoah"
    }

    emp.run {
        age=88
        name="hehehe"
    }
    println(emp)
}
data class Employee(var name:String="",var age:Int=18)