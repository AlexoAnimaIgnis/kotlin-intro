package inaction.functions

fun main() {
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(list.javaClass)
    println(map.javaClass) // javaclass is equal to java's getClass()

    val strings = listOf("first", "second", "fourteenth")
    print(strings.last())
    val numbers = setOf(1, 14, 2)
    println(numbers.max())
}