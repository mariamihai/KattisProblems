package difficulty_1

fun main() {
    val line = readLine()!!

    val numberOfWords = line.split(' ').size
    val uniqueWords = line.split(' ').toSet()

    if(numberOfWords == uniqueWords.size)
        println("yes")
    else
        println("no")
}