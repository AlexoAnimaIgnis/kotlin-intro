package com.kotlinplayground.kotininaction.basics

class Person (
    val name: String,
    val isMarried: Boolean
)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() =  height == width
}

enum class Color (
    val r: Int,
    val g: Int,
    val b: Int
){
    RED(255, 0, 0), ORANGE(255,165, 0),
    YELLOW(255, 255,0), GREEN(0, 255, 0), BLUE(0,0, 255),
    INDIGO(75,0,130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun getWarmth( color: Color) = when(color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "Cold"
}

// USING SETOF
// setOf creates a set containing the objects as its arguments.
// Set is a collection for which the order of items doesnt matter but uniqueness is guaranteed
fun mix(c1 : Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty Color")
    }

fun main() {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)

    println("Color from Enum class ${Color.RED.rgb()}")
    println("Warmth value: ${getWarmth(Color.RED)}")
    println("Mixing colors: ${mix(Color.RED, Color.YELLOW)}")
}