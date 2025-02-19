import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val numbers = IntArray(n)
    val count = IntArray(n) {1}

    val st = StringTokenizer(br.readLine())
    repeat(n) {
        numbers[it] = st.nextToken().toInt()
    }
    for (i in 0 until n) {
        for (j in 0 until i) {
            if(numbers[i] > numbers[j])
                count[i] = max(count[i], count[j]+1)
        }
    }
    println(count.max())
}