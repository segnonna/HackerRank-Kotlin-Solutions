import kotlin.io.*
import kotlin.text.*

// Complete the dayOfProgrammer function below.
fun dayOfProgrammer(year: Int): String {
   val sumSevenMontths = 31  + 31 + 30 + 31 + 30 + 31 + 31
   val isLeapYear=  when {
        year in 1700..1917 -> {
            year%4 ==0
        }
        year>=1918 -> {
             year%400 ==0  ||  (year%4 ==0 && year%100 !=0)
        }
       else -> {
           false
       }
   }

    val sumHeigthMontths=   if (year ==1918){
        sumSevenMontths + 15
    }else{
        if (isLeapYear){
            sumSevenMontths + 29
        }else{
            sumSevenMontths + 28
        }
    }

    return "${256-sumHeigthMontths}.09.$year"
}


fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
