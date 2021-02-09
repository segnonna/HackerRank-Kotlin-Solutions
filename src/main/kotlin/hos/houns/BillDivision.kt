package hos.houns

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the main.hos.houns.bonAppetit function below.
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
