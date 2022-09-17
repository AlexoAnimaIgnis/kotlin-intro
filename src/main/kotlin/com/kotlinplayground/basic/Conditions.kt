package com.kotlinplayground.basic

fun main() {
    //if-else
    val name = "Alex"
    val result = if (name.length == 4) {
        println("Name is four characters")
        name.length
    } else {
        println("name is more than four characters")
        name.length
    }

    println("result: $result")
}