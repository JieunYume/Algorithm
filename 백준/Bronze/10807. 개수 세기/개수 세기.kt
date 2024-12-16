import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = ArrayList<Int>(n)

    for(i: Int in 0..n-1){
        a.add(sc.nextInt())
    }

    val goal = sc.nextInt()
    var result = 0

    for(i: Int in 0..n-1){
        if(a.get(i) == goal){
            result++
        }
    }
    println(""+result)
}