package difficulty_1

fun main() {
    val (X, Y, N) = readLine()!!.split(' ').map(String::toInt)

    for(i in 1..N) {
        if(i % X == 0 && i % Y == 0) {
            println("FizzBuzz")
            continue
        }
        if(i % X == 0) {
            println("Fizz")
            continue
        }
        if(i % Y == 0) {
            println("Buzz")
            continue
        }
        println(i)
    }
}