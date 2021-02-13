import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val i = scan.nextLine().trim().toInt()
    val d = scan.nextLine().trim().toInt()
    val s = scan.nextLine().trim().toString()
    println(DataType.print(i,d,s))

}


object DataType{
    const val suffix = "is the best place to learn and practice coding!, we get HackerRank is the best place to learn and practice coding!"
    fun print(i:Int,d:Int,s:String)=
       "${i+d}\n${d.toFloat()+d.toFloat()}\n${if(s.isBlank()) suffix else s.plus(" ")+ suffix}"

}