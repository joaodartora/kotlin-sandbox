package functions

class Mutability {

    // Var CAN be mutated after initialization
    fun mutableVariable() {
        var message = "Hello world"
        message = "Olá mundo"

        println(message)
    }

    // Var CANNOT be mutated after initialization
    fun imutableVariable() {
        val message = "Hello world"
        println(message)
    }
}

fun main() {
    val mutability = Mutability()
    println(mutability.imutableVariable())
    println(mutability.mutableVariable())
}