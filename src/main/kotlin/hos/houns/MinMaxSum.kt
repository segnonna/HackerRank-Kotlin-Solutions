package hos.houns

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the main.hos.houns.miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {
    arr.sort()
    var minSum: Long = arr.max()?.toLong()?.times(-1)?:0L
    var maxSum: Long =arr.min()?.toLong()?.times(-1)?:0L
    for (i in arr){
        minSum +=i
        maxSum+=i
    }
    println("$minSum $maxSum")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
