import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.StreamTokenizer
import java.util.*
import kotlin.collections.ArrayDeque


fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int {
        nextToken()
        return nval.toInt() // nval: 토큰이 숫자라면 그 숫자의 값을 나타낸다.
    }
    val n = nextInt()
    val m = nextInt()
    val v = nextInt()

    val graph = Array(n+1) {
        IntArray(n+1)
    }

    for (i in 0 until m) {
        val a = nextInt()
        val b = nextInt()

        graph[a][b] = 1
        graph[b][a] = 1
    }

//    graph.forEach {
//        it.forEach {
//            print("$it ")
//        }
//        println()
//    }

    println(dfsWithStack(graph, v))
    println(bfsWithQueue(graph, v))
}

fun dfsWithStack(graph: Array<IntArray>, v: Int): String {
    val stack = Stack<Int>()
    val visited = BooleanArray(graph.size){false}
    var result = ""

    stack.add(v)

    while (stack.isNotEmpty()) {
        val currentNode = stack.pop()

        if (!visited[currentNode]) {
            visited[currentNode] = true
            result += "$currentNode "
        }

        for (i in graph.size - 1 downTo 1) { // downTo를 새로 배웠다!
            if (graph[currentNode][i] == 1 && !visited[i]) {
                stack.add(i)
            }
        }
    }
    return result
}

fun bfsWithQueue(graph: Array<IntArray>, v: Int): String {
    val queue = ArrayDeque<Int>()
    val visited = BooleanArray(graph.size)
    var result = ""

    queue.add(v)
    visited[v] = true

    while (queue.isNotEmpty()) {
        val currentNode = queue.removeFirst()
        result += "$currentNode "

        for (i in 1 until graph.size) {
            if (graph[currentNode][i] == 1 && !visited[i]) {
                queue.add(i)
                visited[i] = true
            }
        }
    }

    return result
}

fun dfsWithRecursion() {

}