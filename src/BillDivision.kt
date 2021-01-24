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

// Complete the bonAppetit function below.
fun bonAppetit(bill: Array<Int>, itemAnnaDoesntEat: Int, annaChargedAmout: Int): Unit {
    var sum=0
    for (i in bill.indices){
        if (i != itemAnnaDoesntEat ){
            sum+=bill[i]
        }
    }
    if (sum/2 == annaChargedAmout){
        println("Bon Appetit")
    }else{
        println(annaChargedAmout - sum/2)
    }

}

fun main(args: Array<String>) {
    val nk = readLine()!!.trimEnd().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
