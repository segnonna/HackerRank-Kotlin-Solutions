package hos.houns

import java.util.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the main.hos.houns.staircase function below.
fun staircase(n: Int): Unit {
    for (row in 0 until n){
        for (column in 0 until n){
            if (column >= n-row-1) {
                print("#")
            }
            else{
                print(" ")
            }
        }
        println("")
    }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}
