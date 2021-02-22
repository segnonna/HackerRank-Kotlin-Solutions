package hos.houns

/**
 * @author : hospicehounsou
 * @created : 22/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 **/

//
object BinarySearch {
    fun getTargetPositionInList(arr: Array<Int>, target:Int): Int{
        var left= 0
        var right= arr.size-1
        while (left <=right){
            val midPosition = (left+right)/2
            when {
                arr[midPosition] ==target -> {
                    return  midPosition
                }
                target <arr[midPosition] -> {
                    right = midPosition-1
                }
                else -> {
                    left=midPosition+1
                }
            }
        }
        return -1
    }
}

fun main(){

}