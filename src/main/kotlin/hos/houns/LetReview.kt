package hos.houns

import java.util.*

/**
 * @author : hospicehounsou
 * @created : 09/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 **/
object LetReview {
    fun review(input:String):String{
        var evenString=""
        var oddString=""
        for (indice in input.indices){
            if (indice%2 ==0){
                evenString +=input[indice]
            }else{
                if (oddString.isEmpty()){
                    oddString +=" ${input[indice]}"
                }else{
                    oddString +=input[indice]
                }

            }
        }
        return "$evenString$oddString"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val list= mutableListOf<String>()

    repeat(n){
        list.add(scan.nextLine().trim())
    }

    list.forEach {
        println(LetReview.review(it))
    }

}