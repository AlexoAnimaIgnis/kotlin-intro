package com.kotlinplayground.kotininaction.basics

fun hasChar(s : String, ch : Char) : Boolean {
    for( c in s) {
        if( c == ch) return true
    }
    return false
}

fun main() {
    println(hasChar("kotlin", 't'))
    println(hasChar("kotlin", 'a'))
}