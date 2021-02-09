package hos.houns

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the main.hos.houns.birthday function below.
fun birthday(arr: Array<Int>, day: Int, month: Int): Int {
    var count=0
        for (i in 0..arr.size-month) {
             var cpt =0
            var sum = 0
            while (cpt<month){
                sum+=arr[i+cpt]
                cpt++
            }
            if (sum ==day){
                count++
            }
        }

    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
