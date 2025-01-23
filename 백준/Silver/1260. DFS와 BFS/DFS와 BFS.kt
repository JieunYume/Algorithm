import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayDeque


fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val v = st.nextToken().toInt()

    val graph = Array(n+1, {IntArray(n+1, {0})})

    for (i in 0 until m) {
        st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
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

    while (queue.isNotEmpty()) {
        val currentNode = queue.removeFirst()
        visited[currentNode] = true
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