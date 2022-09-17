package com.kotlinplayground.basic

fun main() {
    val name : String = "Alexo"
    println(name)

    // name = "Raphaela" -- not allowed as val is immutable
    var age : Int = 18
    println(age)
    age = 19
    println(age)

    val salary : Long = 30000L
    println(salary)

    val course = "Astronomy"
    println("Course: $course and the course length is ${course.length}")

    val multiline = "ABC\nDEF"
    println(multiline)

    val multiline_1 = """
        ABC
        DEF
        GHI
    """.trimIndent()
    println(multiline_1)
}