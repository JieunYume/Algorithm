import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.StreamTokenizer
import kotlin.collections.ArrayDeque


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()

    val graph = Array(n) {
        IntArray(n)
    }

    for (i in 0 until n) {
        val s = br.readLine()
        graph[i] = s.map {
            Character.getNumericValue(it)
        }.toIntArray()
    }

//    graph.forEach {
//        it.forEach {
//            print("$it ")
//        }
//        println()
//    }


    val queue = ArrayDeque <Pair<Int, Int>>()
    val visited = Array(n) {
        BooleanArray(n)
    }
    val answer = ArrayList<Int>()

    fun bfsWithQueue(i: Int, j: Int) {
        queue.add(i to j)
        visited[i][j] = true
        answer.add(1)

        while (queue.isNotEmpty()) {
            val currentNode = queue.removeFirst()
            val nodesToVisit = listOf(currentNode.first+1 to currentNode.second,
                currentNode.first-1 to currentNode.second,
                currentNode.first to currentNode.second+1,
                currentNode.first to currentNode.second-1)

            for (nodeToVisit in nodesToVisit) {
                if (nodeToVisit.first in 0 until n
                    && nodeToVisit.second in 0 until n
                    && !visited[nodeToVisit.first][nodeToVisit.second]
                    && graph[nodeToVisit.first][nodeToVisit.second] == 1) {
                    queue.add(nodeToVisit)
                    visited[nodeToVisit.first][nodeToVisit.second] = true
                    answer[answer.size-1]++
                }
            }
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (!visited[i][j] && graph[i][j] == 1) {
                bfsWithQueue(i, j)
            }
        }
    }
    answer.sort()

    println(answer.size)
    answer.forEach{println(it)}
}