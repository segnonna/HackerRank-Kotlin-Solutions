package hos.houns.daysOflearn

import java.util.*

/**
 * @author : hospicehounsou
 * @created : 23/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 */
object LinkedList {
    fun insert(head: Node?, data: Int): Node {
       head?.let {
          var tmp = head
           while(tmp?.next != null){
               tmp = tmp.next
           }
           tmp?.next =  Node(data)
           return head
       }?: kotlin.run {
           return Node(data)
       }
    }

    fun display(head: Node?) {
        var start = head
        while (start != null) {
            print(start.data.toString() + " ")
            start = start.next
        }
    }
     data class Node(var data :Int, var next: Node? =null) {

    }
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var head: LinkedList.Node? = null
    var N = sc.nextInt()
    while (N-- > 0) {
        val ele = sc.nextInt()
        head = LinkedList.insert(head, ele)
        println("    ${head}")
    }
    LinkedList.display(head)
    sc.close()
}