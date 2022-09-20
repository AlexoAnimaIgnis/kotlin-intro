package com.kotlinplayground.oop

object Authenticate {

    fun authenticate(userName: String, password: String) {
        println("Username is  : $userName")
    }
}

fun main() {
    Authenticate.authenticate("Alexo", "abc")
}