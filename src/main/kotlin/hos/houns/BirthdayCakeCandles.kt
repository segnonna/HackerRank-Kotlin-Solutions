package hos.houns

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'main.hos.houns.birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    candles.sort()
    val max = candles.max()?:0L
    return candles.count { it ==max }

}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
