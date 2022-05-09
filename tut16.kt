open class BasicPhone{
    init{
        println("Parent constructor is called")
    }
    val name="Nokia"
    val type="Basic 1100"
    val volume=10

    fun makeCall(){
        println("Making a call..")
    }
    fun display(){
        println("Displaying..")
    }
    open fun powerOff(){
        println("Powering off..")
    }
    fun getDeviceInfo(){
        println("Getting device info..")
    }

    fun getScreenInfo(){
        println("Getting a screenshot..")
    }
}
class SmartPhone:BasicPhone(){
    init{
        println("Child constructor is called")
    }
    fun playMovie(){
        println("Playing movie..")
    }
    fun playMusic(){
        println("Playing music..")
    }
    override fun powerOff(){
        super.powerOff()
        println("Powering off smartphone..")
    }
}

fun main() {
    val p=SmartPhone()
    p.makeCall()
    p.playMusic()
    p.powerOff()

}