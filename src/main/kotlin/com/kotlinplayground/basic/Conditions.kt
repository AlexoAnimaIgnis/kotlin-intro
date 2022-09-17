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

    //1 -> GOLD, 2 -> SILVER, 3 -> BRONZE
    val position = 2
    val medal = if(position == 1) {
        "GOLD"
    } else if(position == 2) {
        "SILVER"
    } else if(position == 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }

    val position_when = 1
    val medal_when = when(position_when) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    print(medal_when)
}