import java.util.*

fun main(args: Array<String>) {

//    val (n, m) = readln().trim().split(" ").map { it.toInt() }
//
//    val bluraySizes = readln().trim().split(" ").filter { it.isNotEmpty() }.map { it.toInt() }.toIntArray()
//
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val m = scanner.nextInt()

    // 두 번째 줄에서 블루레이 크기를 입력받기
    val bluraySizes = IntArray(n)
    for (i in 0 until n) {
        bluraySizes[i] = scanner.nextInt()
    }

//    println("n: $n, m: $m, bluraySizes: ${bluraySizes.size}개, ${bluraySizes.max()}")

    var low = bluraySizes.max()
    var high = bluraySizes.sum()

    while (low < high) {
        val mid = (low + high) / 2
        var blurayCount = 1
        var sum = 0
//        println("low: $low, high: $high, mid: $mid")

        for(i in bluraySizes.indices){
            if (sum + bluraySizes[i] > mid) {
                blurayCount++
                sum = bluraySizes[i]
            } else {
                sum += bluraySizes[i]
            }
        }

        if (blurayCount <= m) {
            high = mid
        } else {
            low = mid + 1
        }
    }
    println(low)
}
