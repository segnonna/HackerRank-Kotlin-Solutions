package hos.houns.daysOflearn

import java.util.*

/**
 * @author : hospicehounsou
 * @created : 11/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 **/

object MyArray {

    fun reverseArray(array: Array<Int>):String{
        var output =""
        for (i in array.size - 1 downTo 0) {
            output+= "${array[i]} "
        }
        return output.trimEnd()
    }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    println(MyArray.reverseArray(arr))
}

