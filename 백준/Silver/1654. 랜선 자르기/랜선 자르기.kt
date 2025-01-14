fun main(args: Array<String>) {

    val (k, n) = readln().split(" ")
    val intK = k.toInt()
    val intN = n.toInt()

    val youngsikLanCable = IntArray(intK)

    var max: Long = 0
    for(i in 0 until intK) {
        youngsikLanCable[i] = readln().toInt()
        if (max < youngsikLanCable[i]) {
            max = youngsikLanCable[i].toLong()
        }
    }
    
    max++

    var min: Long = 0
    var mid: Long

    while (min < max) {
        mid = (min + max) / 2

        var count: Long = 0
        youngsikLanCable.forEach { cable ->
            count += (cable / mid)
        }

        if (count < intN) {
            max = mid
        } else {
            min = mid + 1
        }
    }


   println(min-1)
}
