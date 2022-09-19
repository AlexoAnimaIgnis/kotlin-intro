package com.kotlinplayground.oop

class Item() {
    var name : String = ""
    var price: Double = 0.0
    get() {
        println("INSIDE GETTER")
        return field
    }
    set(value) {
        println("INSIDE SETTER")
        if(value>=0.0) {
            field = value
        } else {
            throw IllegalArgumentException()
        }
    }

    constructor(_name: String) : this() {
        name = _name
    }
}

fun main() {
    val item = Item("Iphone")
    println("Item name is : ${item.name}")

    item.price = 10.0
    println(item.price)
}