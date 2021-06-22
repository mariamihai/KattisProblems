package difficulty_1

fun main() {
    val correctPieces = arrayOf(1, 1, 2, 2, 2, 8)
    val existingPieces = readLine()!!.split(' ').map(String::toInt)

    for(i in 0 until correctPieces.size) {
        print("${correctPieces[i] - existingPieces[i]} ")
    }
}