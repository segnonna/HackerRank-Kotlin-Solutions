import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the migratoryBirds function below.
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
