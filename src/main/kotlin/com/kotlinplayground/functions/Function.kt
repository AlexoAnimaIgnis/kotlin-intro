package com.kotlinplayground.functions


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

fun main() {
    printHello()
    printHelloName("Alexo")
    val result = addition(1, 2)
    println("Result is $result")
}