import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()

    val a = IntArray(n)
    var temp: Int = 0
    for (i in 1..n) {
        a[i - 1] = i
    }

    for (i in 1..m) {
        var start = sc.nextInt() // 1, 2, 3
        var end = sc.nextInt() // 5, 4, 3

        while (start < end) {
            temp = a[start - 1]
            a[start - 1] = a[end - 1]
            a[end - 1] = temp
            start++
            end--
        }

    }
    for (i in 0..n - 1) {
        print("" + a[i] + " ")
    }
    println()
}