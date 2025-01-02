import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val alphabetIndex = IntArray(26) { -1 }

    for (i in 0..a.length-1) {
        val current = a.get(i)-'a'
        if (alphabetIndex[current] == -1) {
            alphabetIndex[a.get(i)-'a'] = i
        }
    }

    alphabetIndex.forEach { print("${it} ") }
}