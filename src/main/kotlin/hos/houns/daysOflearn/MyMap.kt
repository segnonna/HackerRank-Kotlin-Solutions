package hos.houns.daysOflearn

import java.util.*
import kotlin.collections.HashMap

/**
 * @author : hospicehounsou
 * @created : 15/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 **/
object MyMap {
    fun search(data :HashMap<String,String>,  queries:List<String>):List<String>{
        val output = mutableListOf<String>()
        queries.forEach { query ->
            data[query]?.let {
                output.add("$query=$it")
            }?: kotlin.run {
                output.add("Not Found")
            }
        }

        return output
    }

}

fun main(args: Array<String>){
    val myMap = HashMap<String,String>()
    val queries = mutableListOf<String>()
    val scan = Scanner(System.`in`)
    val numberOfEntries = scan.nextLine().trim().toInt()

    for (i in 1..numberOfEntries){
        val arr = scan.nextLine().split(" ")
         myMap[arr.first()] = arr.last()
    }

    var shouldLoop =true
    while (shouldLoop){
        val query =  scan.nextLine().trim()
        if (query.isNotBlank()){
            shouldLoop =true
            queries.add(query)
        }
        else{
            MyMap.search(myMap,queries).forEach {
                println(it)
            }
            shouldLoop=false
        }
    }

}
