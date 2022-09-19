package com.kotlinplayground.oop

data class Course(
    val id: Int,
    val name: String,
    val author: String
)


fun main() {
    val course = Course(1, "Test", "Test")
    println(course)
    val course1 = Course(1, "Test", "Test")
    println("Object equality: ${course == course1}")
    var course3 = course1.copy(
        id=3, name="alexo"
    )
    println(course3)
}