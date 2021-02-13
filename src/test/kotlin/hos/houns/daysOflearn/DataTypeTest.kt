package hos.houns.daysOflearn

import org.junit.Assert
import org.junit.Test


/**
 * @author : hospicehounsou
 * @created : 11/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 */

internal class DataTypeTest {
    @Test
    fun test(){
        println("0\n0\n${DataType.suffix}")
        Assert.assertEquals(DataType.print(0,0,""),"0\n0.0\n${DataType.suffix}")
        Assert.assertEquals(DataType.print(12,4,""),"16\n8.0\n${DataType.suffix}")
        Assert.assertEquals(DataType.print(12,4,"HackerRank"),"16\n8.0\n${"HackerRank "+DataType.suffix}")

    }
}