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
            var diagonalI = i+1
            var diagonalJ = j+1
            val target = numbers[i][j]
            while (diagonalI < n && diagonalJ < m) {
                if (numbers[diagonalI][diagonalJ] == target) {
                    val dx = abs(i - diagonalI)
                    if (numbers[i + dx][j] == target
                        && numbers[i][j + dx] == target
                    ) squreSizes[i][j] = dx + 1
                }
                diagonalI++; diagonalJ++
            }

            // 왼쪽위 방향
            diagonalI = i-1
            diagonalJ = j-1
            while (diagonalI >= 0 && diagonalJ >= 0) {
                if (numbers[diagonalI][diagonalJ] == target) {
                    val dx = abs(i - diagonalI)
                    if (numbers[i - dx][j] == target
                        && numbers[i][j - dx] == target
                    ) squreSizes[i][j] = dx + 1
                }
                diagonalI--; diagonalJ--
            }

            // 오른쪽위 방향
            diagonalI = i-1
            diagonalJ = j+1
            while (diagonalI >= 0 && diagonalJ < m) {
                if (numbers[diagonalI][diagonalJ] == target) {
                    val dx = abs(i - diagonalI)
                    if (numbers[i - dx][j] == target
                        && numbers[i][j + dx] == target
                    ) squreSizes[i][j] = dx + 1
                }
                diagonalI--; diagonalJ++
            }

            // 왼쪽아래 방향
            diagonalI = i+1
            diagonalJ = j-1
            while (diagonalI < n && diagonalJ >= 0) {
                if (numbers[diagonalI][diagonalJ] == target) {
                    val dx = abs(i - diagonalI)
                    if (numbers[i + dx][j] == target
                        && numbers[i][j - dx] == target
                    ) squreSizes[i][j] = dx + 1
                }
                diagonalI++; diagonalJ--
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