
interface GpsListener {
    fun onGps()
}

open class Bmw() {
    open fun horn() {}
}

class BmwX() : Bmw(), GpsListener {
    override fun horn() {

    }

    override fun onGps() {
        
    }
}