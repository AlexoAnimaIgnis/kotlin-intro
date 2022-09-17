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

    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 0
    do {
        println("Value of i is: $i")
        i++
    }while(i < 5)
}

fun exploreWhile() {
    var x = 1
    while(x < 5) {
        println("x: $x")
        x++
    }
}
