package com.kotlinplayground.basic

fun main() {
    val range = 1..10
    for(i in range) {
        println("i: $i")
    }

    val reverse_range = 10 downTo 1
    for(i in reverse_range) {
        println("reverseRange: $i")
    }

    for(i in reverse_range step 2) {
        println("reverseRange: $i")
    }
}