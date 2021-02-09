package hos.houns

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the main.hos.houns.plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    var nbPositive= 0.0
    var nbNegative= 0.0
    var nbZero=0.0
    arr.forEach {
        when{
            it > 0 -> nbPositive++
            it < 0 -> nbNegative++
            else -> nbZero++
        }
    }


    println("%.6f".format(nbPositive.div(arr.size)))
    println("%.6f".format(nbNegative.div(arr.size)))
    println("%.6f".format(nbZero.div(arr.size)))
}
fun Float.roundTo() : Float {
    return "%.6f".format(this).toFloat()
}
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}