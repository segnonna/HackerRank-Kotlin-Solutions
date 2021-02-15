package hos.houns.daysOflearn

import hos.houns.daysOflearn.Factoriel.factorial
import java.util.*

/**
 * @author : hospicehounsou
 * @created : 15/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 **/

object Factoriel {
    // Complete the factorial function below.
    fun factorial(n: Int): Int {
        return if (n <=1){
            1
        }
        else{
            n* factorial(n-1)
        }
    }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val result = factorial(n)
    println(result)
}