import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val graph = Array(n+1) { mutableListOf<Int>() }

    repeat(m) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        graph[b].add(a)
    }

//    graph.forEach {
//        it.forEach {
//            print("$it ")
//        }
//        println()
//    }

    var visited = BooleanArray(n+1) { false }
    var count = 0
    val result = IntArray(n+1)

    fun dfs(node: Int) {
        visited[node] = true
        count++
        for (neighbor in graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor)
            }
        }
    }

    for (i in 1..n) {
        dfs(i)
        result[i] = count
        count = 0
        visited = BooleanArray(n+1) { false }
    }

    // 최대값의 모든 인덱스 찾기
    val maxIndices = result.max().let {
        result.indices.filter { index -> result[index] == it }
    }

    maxIndices.forEach{
        print("$it ")
    }
}