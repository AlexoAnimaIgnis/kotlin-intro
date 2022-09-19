package com.kotlinplayground.functions

const val courseName = "KotlinProgramming"

fun topLevelFunction():Int {
    return (0..100).random()
}

fun main(){
    val num = topLevelFunction()
    println("Num is : $num")
}