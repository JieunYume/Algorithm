import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.nextLine().trim()
    var size = 0

    if (s.equals("")) {
        print(size)
    } else{
        println(s.split(" ").size)
    }
}