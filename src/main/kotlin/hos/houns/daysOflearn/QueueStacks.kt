package hos.houns.daysOflearn

import sun.misc.Queue
import java.util.*

/**
 * @author : hospicehounsou
 * @created : 23/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 **/
object QueueStacks {
    var stack = Stack<Char>()
    var queue = Queue<Char>()
    fun pushCharacter(c: Char) {
        stack.push(c)
        //println(stack)
    }

    fun enqueueCharacter(c: Char) {
       queue.enqueue(c)
    }

    fun popCharacter(): Char {
         return  stack.pop()
    }

    fun dequeueCharacter(): Char {
       return  queue.dequeue()
    }

}

fun main(){
    val scan = Scanner(System.`in`)
    val input: String = scan.nextLine()
    scan.close()

    // Convert input String to an array of characters:
    val s = input.toCharArray()

    // Enqueue/Push all chars to their respective data structures:
    for (c: Char in s) {
        QueueStacks.pushCharacter(c)
        QueueStacks.enqueueCharacter(c)
    }

    // Pop/Dequeue the chars at the head of both data structures and compare them:
    var isPalindrome = true
    for (i in 0 until s.size / 2) {
        if (QueueStacks.popCharacter() !== QueueStacks.dequeueCharacter()) {
            isPalindrome = false
            break
        }
    }

    //Finally, print whether string s is palindrome or not.
    println(
        "The word, " + input + ", is "
                + if (!isPalindrome) "not a palindrome." else "a palindrome."
    )
}
