package hos.houns

import org.junit.Assert
import org.junit.Test

/**
 * @author : hospicehounsou
 * @created : 22/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 */
internal class BinarySearchTest{
    @Test
    fun test(){
        Assert.assertEquals(BinarySearch.getTargetPositionInList(arrayOf(0),10),-1)
        Assert.assertEquals(BinarySearch.getTargetPositionInList(arrayOf(5,10,15),5),0)
        Assert.assertEquals(BinarySearch.getTargetPositionInList(arrayOf(5,10,15,20),10),1)
        Assert.assertEquals(BinarySearch.getTargetPositionInList(arrayOf(5,10,15,20),20),3)
    }
}