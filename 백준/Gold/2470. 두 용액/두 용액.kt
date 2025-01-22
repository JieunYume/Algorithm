import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()

    val solutionValues = IntArray(n)
    val result = IntArray(2)
    for (i in 0 until n) {
        solutionValues[i] = scanner.nextInt()
    }
    // 정렬한다.
    solutionValues.sort()

    var left = 0
    var right = n-1
    var min = Int.MAX_VALUE // 여기 고침

    while (left < right) {
        val sum = solutionValues[left] + solutionValues[right]
        if (Math.abs(sum) < min) {
            min = Math.abs(sum)
            result[0] = solutionValues[left]
            result[1] = solutionValues[right]
        }

        if (sum > 0) {
            right--
        } else if (sum < 0) {
            left++
        } else {
            break
        }
    }

    println("${result[0]} ${result[1]}")

}
