package functions

class NullSafety {

    // First dont print, after print not null variable
    fun smartCast() {
        var str: String? = null
        if (str != null) {
            println(str.toUpperCase())
        }
        str = "Now not null"
        println(str.toUpperCase())
    }

    // Prints null
    fun safeCall() {
        val str: String? = null
        println(str?.toUpperCase())
    }

    // If null, uses right, othercase uses left
    fun elvisOperator() {
        val str: String? = null
        val myStrNonNull: String = str ?: "other string"
        println(myStrNonNull)
    }
}

fun main() {
    val nullSafety = NullSafety()
    nullSafety.smartCast()
    nullSafety.safeCall()
    nullSafety.elvisOperator()
}