fun main(args: Array<String>) {
    val factory=GunFactory()
    var theGun :Gun? = null

    println("Type the sort of the gun [A,M,P]")
    val type = readLine()!!
    theGun = factory.makeGun(type)

    if (theGun != null) {
        doStaff(theGun)
    }

}
fun doStaff(aGun: Gun){
    aGun.display()
    aGun.pullTheTrigger()

}