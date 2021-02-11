package hos.houns.daysOflearn

import org.junit.Assert
import org.junit.Test


/**
 * @author : hospicehounsou
 * @created : 11/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 */
internal class MyArrayTest{
    @Test
    fun test(){
        Assert.assertEquals(MyArray.reverseArray(arrayOf()), "")
        Assert.assertEquals(MyArray.reverseArray(arrayOf(1)), "1")
        Assert.assertEquals(MyArray.reverseArray(arrayOf(1,2)), "2 1")
        Assert.assertEquals(MyArray.reverseArray(arrayOf(1,2,3)), "3 2 1")
    }
}