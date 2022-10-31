package inaction.basics


enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

// Enum class with properties
enum class Color2 (
    val r: Int,
    val g: Int,
    val b: Int
){
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0,0, 255);

    fun rgb() = (r*256+g) * 256 +b

}

fun main() {
    println(Color2.BLUE.rgb())
}