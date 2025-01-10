import java.util.Scanner

fun main(args: Array<String>) {
    val s = readln().trim()
    var size = 0

    if (s.equals("")) {
        print(size)
    } else{
        println(s.split(" ").size)
    }
}