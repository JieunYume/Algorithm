import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var result = ""

    for (i in 1..n) {
        val r = sc.nextInt()
        val s = sc.next()
        var repeat = ""

        s.forEach {
            for (j in 1..r) {
                repeat += it
            }
        }
        result += repeat+"\n"
    }
    print(result)

}