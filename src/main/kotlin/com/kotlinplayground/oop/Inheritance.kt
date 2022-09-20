package com.kotlinplayground.oop

open class User(val name: String) {
    open var isLoggedIn : Boolean = false
    open fun login() {
        println("Inside User Login")
    }
}

class Student(name: String): User(name) {
    override var isLoggedIn : Boolean = true
    override fun login() {
        println("Inside Student login")
        super.login()
    }
}

class Instructor(name: String): User(name)

fun main() {
    val student = Student("alexo")
    println("Student is: ${student.name}")
    student.login()
    println("Student LoggedIn value is: ${student.isLoggedIn}")
    val instructor = Instructor("alexo")
    println("Instructor is: ${instructor.name}")
    instructor.login()
}