import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val result = StringBuilder()

    repeat(n) {
        val r = sc.nextInt()
        val s = sc.next()
        val repeat = StringBuilder()

        s.forEach { c ->
            repeat(r) { repeat.append(c) }
        }
        result.append(repeat)
        result.append("\n")
    }
    print(result)
}