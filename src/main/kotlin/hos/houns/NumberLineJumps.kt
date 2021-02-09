package hos.houns

import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the main.hos.houns.kangaroo function below.
fun kangaroo(positionKan1: Int, jumpDistanceKan1: Int, positionKan2: Int, jumpDistanceKan2: Int): String {
    return if (jumpDistanceKan1 > jumpDistanceKan2) {
        if ((positionKan1 -positionKan2)%(jumpDistanceKan2-jumpDistanceKan1)==0) {
            "YES"
        } else "NO"
    } else{
        "NO"
    }
}
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x1V1X2V2 = scan.nextLine().split(" ")

    val x1 = x1V1X2V2[0].trim().toInt()

    val v1 = x1V1X2V2[1].trim().toInt()

    val x2 = x1V1X2V2[2].trim().toInt()

    val v2 = x1V1X2V2[3].trim().toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
