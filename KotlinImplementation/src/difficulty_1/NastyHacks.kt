package difficulty_1

fun main() {
    val n = readLine()!!.toInt()
    val builder = StringBuilder()

    for(i in 1..n) {
        val (r, e, c) = readLine()!!.split(' ').map(String::toInt)

        val result = e - c

        if(r == result)
            builder.append("does not matter").append("\n")
        else
            if (r > result)
                builder.append("do not advertise").append("\n")
            else
                builder.append("advertise").append("\n")
    }

    println(builder)
}