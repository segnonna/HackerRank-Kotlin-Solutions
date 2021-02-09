package hos.houns

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the main.hos.houns.migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
    var count =0
    var finalType =0
    var tempCount =0
    val types = arrayOf(1,2,3,4,5)
    for (type in types){
        tempCount =0
        for (t in arr){
            if (type ==t){
                tempCount++
            }
        }
        if (tempCount> count){
            count =tempCount
            finalType=type
        }
    }


 return finalType
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
