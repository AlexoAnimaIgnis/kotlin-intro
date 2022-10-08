package com.kotlinplayground.kotininaction.basics


fun showRange(r : IntProgression) {
    for(i in r) {
        print("$i ")
    }
    print("  // $r")
    println()
}
fun main() {

    showRange(1..5) // includes both bounds in the resulting range
    showRange(0 until 5) // until excludes the end
    showRange(5 downTo 1)  // produces a decreasing range
    showRange(0..9 step 2) // step changes the interval
    showRange(0 until 10 step 3)
    showRange(9 downTo 2 step 2)
}