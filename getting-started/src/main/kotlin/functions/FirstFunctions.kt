package functions

import model.User

class FirstFunctions {

    // Classic declaration return
    fun myFirstFunc(): String{
        return "Hello World from function!"
    }

    // Compressed inline declaration and return
    fun inlineReturnFunc() = "Hello World from inline return function"

    // Return Kotlin's "void" type, called Unit
    fun unitFunc(){
        return
    }
}

fun main(){
    val firstFunction = FirstFunctions()
    println(firstFunction.myFirstFunc())
    println(firstFunction.unitFunc())
    println(firstFunction.inlineReturnFunc())
}