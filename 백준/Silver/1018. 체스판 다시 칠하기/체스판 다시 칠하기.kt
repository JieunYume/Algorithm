import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val board = Array(n){IntArray(m) }
    var result = 0

    // (0, 0) 자리가 W가 와야한다고 가정
    for (i in 0 until n) {
        val line = br.readLine().toCharArray()
        for (j in 0 until m) {
            if ((i + j) % 2 == 0) {//짝수 -> W
                if (line[j] == 'B') board[i][j]++
            } else {//홀수 -> B
                if (line[j] == 'W') board[i][j]++
            }
            if(j>0) board[i][j] += board[i][j-1]
        }
    }

//    board.forEach {
//        it.forEach {
//            print("$it ")
//        }
//        println()
//    }

    var count =0
    var min = n * m
    for(i in 0..n-8){
        for (j in 0..m - 8) {
            count = 0
            for(k in i until i+8){
                count += board[k][j+7]
                if(j>0) count -= board[k][j-1]
            }
            if (count > 32) {
                count = 64 - count
            }
            if (min > count) {
                min = count
            }

        }
    }
    println(min)
}