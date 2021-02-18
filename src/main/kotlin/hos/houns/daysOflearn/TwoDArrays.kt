package hos.houns.daysOflearn

import java.util.*

/**
 * @author : hospicehounsou
 * @created : 18/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 **/

object TwoDArrays {
     fun hourglassSum(arr :Array<Array<Int>>){

     }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arr = Array<Array<Int>>(6) { Array<Int>(6) { 0 } }
    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }
}