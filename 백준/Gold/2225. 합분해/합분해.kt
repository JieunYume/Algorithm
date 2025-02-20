import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))

    val DIV = 1000000000
    val (N, K) = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(K + 1) { IntArray(N + 1) { 1 } }

    for (i in 2..K) {
        for (j in 1..N)
            dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % DIV
    }

    println(dp[K][N])
}