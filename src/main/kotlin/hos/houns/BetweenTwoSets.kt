package hos.houns

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'main.hos.houns.getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

/*
2 3
2 4
16 32 96
 */
fun getTotalX(arr1:Array<Int>, arr2:Array<Int>): Int {
    var currentFactor = arr1[arr1.size-1]
    var count =0
    var temp =0

    while (currentFactor <= arr2.first()){
        temp=0

        for (i in arr1.indices){
            if (currentFactor % arr1[i]!=0){
                temp=1
                break
            }
        }

        if (temp == 0){
            for (i in arr2.indices){
                if (arr2[i] % currentFactor!=0){
                    temp=1
                    break
                }
            }
        }
        if (temp ==0)
            count++

        currentFactor++
    }
    return count
}


fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
