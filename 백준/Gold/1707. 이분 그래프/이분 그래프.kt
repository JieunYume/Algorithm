import java.util.*

lateinit var visited : IntArray
lateinit var graph: Array<MutableList<Int>>
var message = "YES"

fun main() = with(System.`in`.bufferedReader()) {
    val tk = readLine().toInt()

    repeat(tk) {
        message = "YES"

        val (v, e) = readLine().split(" ").map { it.toInt() }
        graph = Array(v + 1) { mutableListOf<Int>() }
        visited = IntArray(v + 1) { 0 }

        repeat(e) {
            val (from, to) = readLine().split(" ").map { it.toInt() }
            graph[from].add(to)
            graph[to].add(from)
        }

        for (i in 1..v) {
            if (visited[i] == 0) {
                bfs(i)
            }
        }

        println(message)
    }
}

fun bfs(start: Int) {
    val queue : Queue<Int> = LinkedList()
    queue.add(start)

    while (queue.isNotEmpty()) {
        val from = queue.poll()

        for (to in graph[from]) {
            if (visited[from] == 0) {
                if (visited[to] == 0) {
                    visited[from] = -1
                    visited[to] = 1
                } else {
                    visited[from] = -visited[to]
                }
                queue.add(to)
            } else {
                if (visited[to] == 0) {
                    visited[to] = -visited[from]
                    queue.add(to)
                } else {
                    if (visited[from] == visited[to]) {
                        message = "NO"
                        return
                    }
                }
            }
        }
    }
}