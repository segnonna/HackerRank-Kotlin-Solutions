package hos.houns.daysOflearn

import hos.houns.daysOflearn.Inheritance.Student
import java.util.*


/**
 * @author : hospicehounsou
 * @created : 18/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 **/

object Inheritance {

    class Name(val value: String) {
        init {
            require(value.length in 1..10) {
                "The $value should not be empty and should not have more than 10 characters "
            }
        }
    }

    class ID(val value: Int) {
        init {
            require(value.toString().length == 7) {
                "The $value should be less to 7"
            }
        }
    }

    open class Person(
        open val firstName: Name,
        open val lastName: Name,
        open val idNumber: ID
    ){
        fun printPerson(){
            println("${lastName.value}, ${firstName.value}")
            println("ID: ${idNumber.value}")
        }
    }

    class Student(
        override val firstName: Name,
        override val lastName: Name,
        override val idNumber: ID, private val scores: IntArray
    ) : Person(firstName, lastName, idNumber) {

        fun calculate(): Char {
            val average = scores.sumBy { it } / scores.size
            return when {
                average < 40 -> {
                    'T'
                }
                average <= 40 && average < 55 -> {
                    'D'
                }
                average <= 55 && average < 70 -> {
                    'P'
                }
                average <= 70 && average < 80 -> {
                    'A'
                }
                average <= 80 && average < 90 -> {
                    'E'
                }
                average <= 90 && average <= 100 -> {
                    'O'
                }
                else -> ' '
            }


        }
    }

}


fun main() {
    val scan = Scanner(System.`in`)
    val firstName: String = scan.next()
    val lastName: String = scan.next()
    val id: Int = scan.nextInt()
    val numScores: Int = scan.nextInt()
    val testScores = IntArray(numScores)
    for (i in 0 until numScores) {
        testScores[i] = scan.nextInt()
    }
    scan.close()

    val s = Student(Inheritance.Name(firstName),
        Inheritance.Name(lastName),
        Inheritance.ID(id),
    testScores)
    s.printPerson()
    println("Grade: " + s.calculate())

}
