package com.kotlinplayground.classes

data class Course (
    val id: Int,
    val name: String,
    val author: String
){

}

fun main() {
    val course = Course(1, "Reactive Programming", "Alexo")
    println(course)

    val item = Item("Iphone")
    println("Item name is ${item.name}")
    item.name = "Iphone 13"
    println("Item name is ${item.name}")
    println(item)
}