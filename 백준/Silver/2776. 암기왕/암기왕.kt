import java.util.*

fun main() {
    val testCaseCount = readLine()!!.toInt()

    repeat(testCaseCount) {
        val n = readLine()!!.toInt()
        val note1 = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

        Arrays.sort(note1)
        val m = readLine()!!.toInt()
        val note2 = readLine()!!.split(" ").map { it.toInt() }

        val result = IntArray(m)

        for (i in note2.indices) {
            result[i] = if (binarySearch(note1, note2[i])) 1 else 0
        }

        // 결과를 한 번에 출력
        println(result.joinToString("\n"))
    }
}

fun binarySearch(nums: IntArray, target: Int): Boolean {
    var low = 0
    var high = nums.lastIndex

    while (low <= high) {
        val mid = (low + high) / 2

        when {
            target < nums[mid] -> high = mid - 1
            target > nums[mid] -> low = mid + 1
            else -> return true
        }
    }

    return false
}