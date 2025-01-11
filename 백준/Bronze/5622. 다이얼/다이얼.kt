fun main(args: Array<String>) {
    val word = readln()
    var seconds = 0
    for (i in 0 until word.length) {
        when (word.get(i)){
            in 'A'..'C' -> seconds+=3
            in 'D'..'F' -> seconds+=4
            in 'G'..'I' -> seconds+=5
            in 'J'..'L' -> seconds+=6
            in 'M'..'O' -> seconds+=7
            in 'P'..'S' -> seconds+=8
            in 'T'..'V' -> seconds+=9
            in 'W'..'Z' -> seconds+=10
        }

    }
    println(seconds)
}