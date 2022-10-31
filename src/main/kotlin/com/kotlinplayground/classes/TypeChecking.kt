package com.kotlinplayground.classes

fun checkType(type: Any) {

    when(type) {
        is Course -> {
            println(type)
        }
    }
}

fun main() {

    val course = Course(1, "Reactive Programming", "Alexo")
    checkType(course)
}