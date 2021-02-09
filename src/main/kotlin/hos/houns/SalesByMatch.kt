package hos.houns

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the main.hos.houns.sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var pairs =0
    val map = HashMap<Int,Int>()

    for (i in ar){
        var value = map[i]?:0
        if (!map.contains(i)){
            map[i] = 1
        }
        else{
            value++
            map[i] = value
            if (value%2 ==0)  pairs++
        }
    }
    return pairs
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
