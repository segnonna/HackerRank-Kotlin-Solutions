package hos.houns

import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*
import kotlin.math.min


object DrawingBook {
    /*
  * Complete the pageCount function below.
  */
    fun pageCount(numberOfpages: Int, pageToOpen: Int): Int {
        val numbersOfTurnToReachAllPage= numberOfpages/2
        val numberOfTurnToReachTargetPageFromLeftToRight= pageToOpen/2
        val numberOOfTurnToReachTargetPageFromRigthToLeft= numbersOfTurnToReachAllPage-numberOfTurnToReachTargetPageFromLeftToRight
        return   min(numberOfTurnToReachTargetPageFromLeftToRight, numberOOfTurnToReachTargetPageFromRigthToLeft)
    }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val p = scan.nextLine().trim().toInt()

    val result = DrawingBook.pageCount(n, p)

    println(result)
}
