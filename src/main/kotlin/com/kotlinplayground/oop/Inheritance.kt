package com.kotlinplayground.oop

open class User(val name: String)

class Student(name: String): User(name)

class Instructor(name: String): User(name)

fun main() {
    val student = Student("alexo")
    val instructor = Instructor("alexo")
    println("Student is: ${student.name}")
    println("Instructor is: ${instructor.name}")
}