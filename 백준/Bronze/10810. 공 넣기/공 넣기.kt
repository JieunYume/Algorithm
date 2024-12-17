import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = IntArray(n)

    for(i: Int in 0..m-1){
        val start = sc.nextInt()
        val end = sc.nextInt()
        val addNumber = sc.nextInt()

        for(j: Int in start-1..end-1){
            a[j] = addNumber
        }
    }
    for(i: Int in 0..n-1){
        print(""+a.get(i)+" ")
    }
}