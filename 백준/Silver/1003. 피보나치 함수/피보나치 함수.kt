import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val dp = IntArray(41)
    dp[1] = 1
    for (i in 2..40) {
        dp[i] = dp[i-1] + dp[i-2]
    }

    val testNumber = br.readLine().toInt()
    repeat(testNumber) {
        val n = br.readLine().toInt()

        if (n == 0) {
            println("1 0")
        } else {
            println("${dp[n-1]} ${dp[n]}")
        }
    }
}