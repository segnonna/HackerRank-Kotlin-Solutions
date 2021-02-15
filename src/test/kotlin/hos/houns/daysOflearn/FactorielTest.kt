package hos.houns.daysOflearn

import org.junit.Assert
import org.junit.Test


/**
 * @author : hospicehounsou
 * @created : 15/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 */
internal class FactorielTest{

    @Test
    fun test(){
        Assert.assertEquals(Factoriel.factorial(0),1)
        Assert.assertEquals(Factoriel.factorial(1),1)
        Assert.assertEquals(Factoriel.factorial(2),2*1)
        Assert.assertEquals(Factoriel.factorial(3),3*2*1)
        Assert.assertEquals(Factoriel.factorial(4),4*3*2*1)
        Assert.assertEquals(Factoriel.factorial(5),5*4*3*2*1)
        Assert.assertEquals(Factoriel.factorial(10),10*9*8*7*6*5*4*3*2*1)
    }
}