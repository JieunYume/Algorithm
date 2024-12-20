import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var n = 0
    val a = BooleanArray(30)
    for(i in 0..27){
        n = sc.nextInt()
        a[n-1] = true
    }

    for(i: Int in 0..29){
        if(!a[i]){
            println(i+1)
        }
    }
}