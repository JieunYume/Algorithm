import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.nextLine()
    var size = 0

    val words  = s.split(" ")
    words.forEach{ w ->
        if (w != "") {
            size++
        }
    }
    println(size)
}