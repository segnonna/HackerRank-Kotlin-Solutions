package hos.houns.daysOflearn

import java.util.*

/**
 * @author : hospicehounsou
 * @created : 17/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 **/

object BinaryTree {

    fun count(number: Int): Int {
        var numTemp =number
        var remainder = 0
        var s = 0
        var countSuccessiveOne = 0
        while (numTemp > 0) {
            remainder = numTemp % 2
            numTemp /= 2
            if (remainder == 1) {
                s++
                if (s >= countSuccessiveOne)
                    countSuccessiveOne = s
            } else {
                s = 0
            }
        }

        return countSuccessiveOne
    }
}


fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    println(BinaryTree.count(n))

}