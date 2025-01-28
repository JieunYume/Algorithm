import java.io.StreamTokenizer
import kotlin.collections.ArrayDeque


fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int {
        nextToken()
        return nval.toInt()
    }
    val n = nextInt()
    val k = nextInt()

    val queue = ArrayDeque<Int>()
    val visited = BooleanArray(100001)
    val timeTaken = IntArray(100001)
    var count = 0

    queue.add(n)
    visited[n] = true
    timeTaken[n] = 0

    while (queue.isNotEmpty()) {
        val currentNode = queue.removeFirst()
        val nodesToVisit = listOf(currentNode-1, currentNode+1, currentNode*2)

        if (currentNode == k) {
            break
        }

        for (i in nodesToVisit) {
            if (i >= 0 && i <= 100000 && !visited[i]) {
                queue.add(i)
                visited[i] = true
                timeTaken[i] = timeTaken[currentNode] + 1
            }
        }
    }
    println(timeTaken[k])
}