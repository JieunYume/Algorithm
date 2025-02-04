import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val numbers = Array(n){IntArray(m)}
    val squreSizes = Array(n){IntArray(m) {1} }

    repeat(n) {
        numbers[it] = br.readLine().toCharArray().map { Character.getNumericValue(it) }.toIntArray()
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            // 오른쪽아래 방향
            var checkI = i+1
            var checkJ = j+1
            val target = numbers[i][j]
            while (checkI < n && checkJ < m) {
                if (numbers[checkI][checkJ] == target) {
                    val dx = abs(i-checkI)
                    if (numbers[i + dx][j] == target) {
                        if (numbers[i][j + dx] == target) {
                            squreSizes[i][j] = dx+1
                        }
                    }
                }
                checkI++
                checkJ++
            }

            // 왼쪽위 방향
            checkI = i-1
            checkJ = j-1
            while (checkI >= 0 && checkJ >= 0) {
                if (numbers[checkI][checkJ] == target) {
                    val dx = abs(i-checkI)
                    if (numbers[i - dx][j] == target) {
                        if (numbers[i][j - dx] == target) {
                            squreSizes[i][j] = dx+1
                        }
                    }
                }
                checkI--
                checkJ--
            }

            // 오른쪽위 방향
            checkI = i-1
            checkJ = j+1
            while (checkI >= 0 && checkJ < m) {
                if (numbers[checkI][checkJ] == target) {
                    val dx = abs(i - checkI)
                    if (numbers[i - dx][j] == target) {
                        if (numbers[i][j + dx] == target) {
                            squreSizes[i][j] = dx + 1
                        }
                    }
                }
                checkI--
                checkJ++
            }

            // 왼쪽아래 방향
            checkI = i+1
            checkJ = j-1
            while (checkI < n && checkJ >= 0) {
                if (numbers[checkI][checkJ] == target) {
                    val dx = abs(i - checkI)
                    if (numbers[i + dx][j] == target) {
                        if (numbers[i][j - dx] == target) {
                            squreSizes[i][j] = dx + 1
                        }
                    }
                }
                checkI++
                checkJ--
            }


        }
    }

    var max = 0
    squreSizes.forEach {
        val lineMax = it.max()
        if (max < lineMax) {
            max = lineMax
        }
    }
    println(max*max)
}