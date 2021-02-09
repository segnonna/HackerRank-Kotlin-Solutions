package hos.houns

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the hos.houns.countApplesAndOranges function below.
fun countApplesAndOranges(homeStartPosition: Int, homeEndPosition: Int, locationAppleTree: Int, locationOrangeTree: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    var numberOfApples =0
    var numberOfOranges =0
    for (apple  in apples){
        if (apple+locationAppleTree in homeStartPosition..homeEndPosition ){
            numberOfApples++
        }
    }
    println(numberOfApples)

    for (orange  in oranges){
        if (orange+locationOrangeTree in homeStartPosition..homeEndPosition ){
            numberOfOranges++
        }
    }
    println(numberOfOranges)

}

fun main() {
    val scan = Scanner(System.`in`)

    val st = scan.nextLine().split(" ")

    val s = st[0].trim().toInt()

    val t = st[1].trim().toInt()

    val ab = scan.nextLine().split(" ")

    val a = ab[0].trim().toInt()

    val b = ab[1].trim().toInt()

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val apples = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val oranges = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
