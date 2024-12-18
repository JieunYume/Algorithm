import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = IntArray(n)
    for(i in 0..n-1){
        a[i] = i+1
    }

    for(i: Int in 1..m){
        val change1 = sc.nextInt()-1
        val change2 = sc.nextInt()-1
        var temp: Int = 0
        temp = a[change1]
        a[change1] = a[change2]
        a[change2] = temp
    }
    for(i: Int in 0..n-1){
        print(""+a.get(i)+" ")
    }
}