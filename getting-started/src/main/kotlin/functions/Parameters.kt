package functions

import model.User

class Parameters {

    // Receives an Data Class from parameters
    fun funcWithParams(user: User): String {
        val (name, age) = user
        return "Hello World from function with params name=$name, age=$age"
    }

    // Receives params and name then on function call
    fun funcWithNamedParams(name: String, age: Int) {
        println("name=$name, age=$age")
    }

    // Receives params and set default secondary parameter
    fun funcWithDefaultParams(first: String, second: Int = 2) {
        println("first=$first, second=$second")
    }

}

fun main() {
    val parameters = Parameters()
    parameters.funcWithNamedParams(name = "João", age = 22)
    parameters.funcWithParams(User(name = "John", age = 23))
    parameters.funcWithDefaultParams("First function with default params")
}