
class Car( 
    private var nm : String 
) {
    fun speedUp() { }    
}

class Animal {
    constructor() { }

    fun walk() { }
}

fun main(args: Array<String>) {
    val an = Animal()
    val cr = Car("Audi")
}