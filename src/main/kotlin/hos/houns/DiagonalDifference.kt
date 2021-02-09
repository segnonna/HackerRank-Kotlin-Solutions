package hos.houns

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'main.hos.houns.diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

/*
Input
3
11 2 4
4 5 6
10 8 -12
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    val  n =  arr.size
    var left = 0
    var right = 0

    for(i in arr.indices){
        left +=arr[i][i]
        right += arr[n-i-1][i]
    }

    return Math.abs(left-right)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
