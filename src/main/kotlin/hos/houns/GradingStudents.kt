package hos.houns

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'main.hos.houns.gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    val roundedGrade = mutableListOf<Int>()
    for (i in grades.indices){
        roundedGrade.add(roundedGrade(grades[i]))
    }
    return roundedGrade.toTypedArray()
}

fun nextMultipleof5(number:Int):Int{
    return (5 -number%5) +number
}

fun differenceBetweenGradleAndNextMultiple(grade:Int): Int {
    return nextMultipleof5(grade) -grade
}

fun roundedGrade(grade: Int): Int {
    return if (grade < 38){
        grade
    }else{
        val  diff = differenceBetweenGradleAndNextMultiple(grade)
        when{
            diff <3 ->{
                nextMultipleof5(grade)
            }
            else -> grade

        }
    }

}
fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
