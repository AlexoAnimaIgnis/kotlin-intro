package inaction.basics

fun main(args: Array<String>) {
    println("Hello world")
    println(max(1, 2))
}

fun max(a: Int, b: Int) : Int { // block body
    return if(a > b) a else b
}

// function above can be rewritten like this
fun maxConcise(a:Int, b: Int) :Int = if(a > b) a else b // expression body
fun maxConcise2(a:Int, b: Int) = if(a > b) a else b // expression body