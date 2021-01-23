import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.time.Month
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

// Complete the birthday function below.
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
