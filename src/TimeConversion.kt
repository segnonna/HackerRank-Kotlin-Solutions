import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    val string =s.toLowerCase()
    val arr = string.split(":")
    var hour = arr.first().toInt()
    val min = arr[1]

    val secondPattern = Pattern.compile("[^0-9]")
    val second = secondPattern.matcher(arr[2]).replaceAll("")

    val pattern = Pattern.compile("[^a-z]")
    val amOrPm=pattern.matcher(arr[2]).replaceAll("")

    if (amOrPm=="pm"){
        if (hour !=12){
            hour+=12
            if (hour>=24){
                hour -=24
            }
        }

    }
    else{
        if (hour>=12) {
            hour -= 12
        }

    }

    return "${String.format("%02d", hour)}:$min:$second"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
