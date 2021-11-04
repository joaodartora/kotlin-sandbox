package com.joaodartora.kotlinforjavadevs

import com.joaodartora.kotlinforjavadevs.IfWhen.Colour.*

class IfWhen {

    enum class Colour {
        BLUE, RED, YELLOW
    }

    fun printColor(colour: Colour): String =
        when (colour) {
            BLUE -> "Blue"
            RED -> "Red"
            YELLOW -> "Yellow"
        }

    fun printMixedColor(colour1: Colour, colour2: Colour): String =
        when (setOf(colour1, colour2)) {
            setOf(RED, YELLOW) -> "Orange"
            setOf(BLUE, YELLOW) -> "Green"
            setOf(RED, BLUE) -> "Purple"
            else -> throw Exception("Terciary colour")
        }
}

fun main() {
    val whenTesting = IfWhen()
    println(whenTesting.printColor(RED))
    println(whenTesting.printColor(BLUE))

    println(whenTesting.printMixedColor(YELLOW, RED))
    println(whenTesting.printMixedColor(BLUE, RED))

}