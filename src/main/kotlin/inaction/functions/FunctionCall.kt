package inaction.functions


fun main() {
    val list = listOf(1, 2, 3)
    println(list)

    println(joinString(list, "; ", "(", ")"))
}

fun<T> joinString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postFix: String
) : String {

    val result = StringBuilder(prefix)
    for((index,element) in collection.withIndex()) {
        if(index>0) result.append(separator)
        result.append(element)
    }

    result.append(postFix)
    return result.toString()
}