package hos.houns

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the main.hos.houns.breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var bestScoreCount=0
    var bestScore=scores.first()
    var worstScoreCount=0
    var worstScore=scores.first()

    for (i in scores.indices){
           when {
               scores[i]< worstScore -> {
                  worstScore = scores[i]
                   worstScoreCount++
               }
               scores[i]> bestScore -> {
                   bestScore = scores[i]
                   bestScoreCount++
               }
           }
    }
    return arrayOf(bestScoreCount,worstScoreCount)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
