package difficulty_1

fun main() {
    val result = readLine()!!
        .replace("C", "")
        .replace("D", "")
        .replace("H", "")
        .replace("S", "")
        .split(" ").groupByTo(mutableMapOf()) { it }
        .maxByOrNull { it.value.size }!!.component2().size

    println(result)
}