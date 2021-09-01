class GunFactory {

    fun makeGun(gunType: String): Gun? {
        var newGun: Gun? = null
        if(gunType.equals("A")){
            newGun = AK47()
            return newGun
        }else if(gunType.equals("M")){
            newGun = MachineGun()
            return newGun
        }else if(gunType.equals("P")){
            newGun = Pistol()
            return newGun
        }else{
            return null
        }

    }
}