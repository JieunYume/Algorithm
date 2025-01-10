import java.lang.StringBuilder
import java.util.Scanner

fun main(args: Array<String>) {
    val numbers = readln().split(" ")
    val switchNumbers = IntArray(2)
    var temp: Char

    for (i in 0..1) {
        val n = StringBuilder(numbers[i])

        temp = n[0]
        n[0] = n[2]
        n[2] = temp

        switchNumbers[i] = n.toString().toInt()
    }
    if (switchNumbers[0].compareTo(switchNumbers[1]) > 0) {
        print(switchNumbers[0])
    }else{
        print(switchNumbers[1])
    }
}