package difficulty_1

fun main() {
    val (wc, hc, ws, hs) = readLine()!!.split(' ').map(String::toInt)

    if(wc >= (ws + 2) && hc >= (hs + 2)) println(1)
    else println(0)
}