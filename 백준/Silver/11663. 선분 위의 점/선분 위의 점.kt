fun main(args: Array<String>) {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val pointCoordinate = readln().split(" ").map { it.toInt() }.toIntArray()
    pointCoordinate.sort()

    val results = IntArray(m)
    
    repeat(m) { i ->
        val (lineStart, lineEnd) = readln().split(" ").map { it.toInt() }

        // lineStart 미만인 첫 위치를 찾기 위한 이진 탐색
        var low = 0
        var high = pointCoordinate.size
        var resultLow = high // 기본값을 high로 설정

        while (low < high) {
            val mid = (low + high) / 2
            if (pointCoordinate[mid] < lineStart) {
                low = mid + 1
            } else {
                high = mid
            }
            resultLow = low
        }

        // lineEnd 이하인 마지막 위치를 찾기 위한 이진 탐색
        low = 0
        high = pointCoordinate.size
        var resultHigh = high // 기본값을 high로 설정

        while (low < high) {
            val mid = (low + high) / 2
            if (pointCoordinate[mid] <= lineEnd) {
                low = mid + 1
            } else {
                high = mid
            }
            resultHigh = low
        }

        // 결과 계산
        results[i] = resultHigh - resultLow
    }

    println(results.joinToString("\n"))
}
