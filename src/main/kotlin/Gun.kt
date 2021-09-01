abstract class Gun {
    private var name = ""
    private var bulletCount = 0

    public fun getName():String{return name}
    public fun setName(newName: String ){name = newName}

    public fun getBulletCount():Int{return bulletCount}
    public fun setBulletCount(newCount: Int){bulletCount =newCount}

    public fun display(){
        println(getName() + " is displaying...");
    }
    public fun pullTheTrigger(){
        println(getName()+ " sooting. Remaining ammo is " + (getBulletCount()-1))
    }
}