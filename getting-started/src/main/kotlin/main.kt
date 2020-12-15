import model.Chair
import model.GameChair
import model.SingleConstructor

fun main() {

    val chair: Chair = GameChair()
    println("print model without string template=" + chair.model())
    println("print model with string template=${chair.model()}")

    val singleConstructor = SingleConstructor("first property", 31)
    println(singleConstructor.firstProperty)
    println(singleConstructor.thirdProperty)

}