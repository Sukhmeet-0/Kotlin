fun main() {
    val i=IntContainer(4)
    println(i.getValue())
    val ii=Container<Int>(4)
    println(ii.getValue())
    val s=Container<String>("Sukhmeet")
    println(s.getValue())



    add(1,2,3,4,5)
}
class Container<T>(var data:T){
    fun setValue(value:T){
        data=value
    }
    fun getValue():T{
        return data
    }
}
class IntContainer(var data:Int){
    fun setValue(value:Int){
        data=value
    }
    fun getValue():Int{
        return data
    }
}class StringContainer(var data:String){
    fun setValue(value:String){
        data=value
    }
    fun getValue():String{
        return data
    }
}
fun add(vararg values:Int){
    var sum=0
    for (i in values){
        sum+=i
    }
    println(sum)
}