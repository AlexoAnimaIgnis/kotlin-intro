package com.kotlinplayground.functions

import java.time.LocalDate


fun printHello() {
    println("Hello!")
}

fun printHelloName(name: String) {
    println("Hello, $name")
}

fun addition(x : Int, y : Int) : Int {
    return x + y
}

// Simple approach
fun addition_2(x : Int, y : Int) = x + y


fun printPersonDetails(name: String,
                       email: String = "",
                       dob: LocalDate = LocalDate.now()) {
    println("Name is $name, email is $email and dob is $dob")
}

fun main() {
    printHello()
    printHelloName("Alexo")
    val result = addition(1, 2)
    println("Result is $result")

    printPersonDetails("Alexo", "a@gmail.com", LocalDate.parse("2000-12-26"))
    printPersonDetails("Alexo")
}