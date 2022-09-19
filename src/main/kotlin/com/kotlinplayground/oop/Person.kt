package com.kotlinplayground.oop

class Person(
    val name: String = "",
    val age: Int = 0
) {

    fun action() {
        println("Person walked")
    }
}

fun main() {
    val person = Person("Alex", 24)
    person.action()
    println("Name : ${person.name} and the age is ${person.age}")
    val person2 = Person()
    person2.action()
    println("Name : ${person2.name} and the age is ${person2.age}")
}