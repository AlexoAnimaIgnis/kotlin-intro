package com.kotlinplayground.oop

class Person(
    val name: String = "",
    val age: Int = 0
) {

    var email : String = ""
    constructor(_email: String,
                _name: String = "",
                _age: Int = 0) : this(_name, _age) {
        email = _email
    }

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

    val person3 = Person(_email = "ab@gmail.com", "Alex", 24)
    println("Name : ${person3.name} and the age is ${person3.age}, and email is ${person3.email}")
}