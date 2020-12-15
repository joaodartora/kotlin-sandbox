package model

class SingleConstructor(
    val firstProperty: String,
    val thirdProperty: Int
) {
    init {
        println("constructed init block first property=$firstProperty")
    }

    val secondProperty: String = "custom prop2"

    init {
        println("constructed init block second property=$secondProperty")
    }
}