package difficulty_1

fun main() {
    val (articles, impact) = readLine()!!.split(' ').map(String::toInt)

    println(Math.ceil(articles * (impact - 0.99)).toInt())
}