package hos.houns.daysOflearn

import org.junit.Assert
import org.junit.Test


/**
 * @author : hospicehounsou
 * @created : 15/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 */
internal class MyMapTest{
    @Test
    fun test(){
        Assert.assertEquals(MyMap.search(hashMapOf(), listOf("")), listOf("Not Found"))
        //Assert.assertEquals(MyMap.search(hashMapOf("" to ""),""),"")
        Assert.assertEquals(MyMap.search(hashMapOf("John" to "12345678"), listOf("ofodd")), listOf("Not Found"))
        Assert.assertEquals(MyMap.search(hashMapOf("John" to "12345678"), listOf("John")), listOf("John=12345678"))
        Assert.assertEquals(MyMap.search(hashMapOf("John" to "12345678", "Mick" to "87654321"), listOf("John")), listOf("John=12345678"))
        Assert.assertEquals(MyMap.search(hashMapOf("John" to "12345678", "Mick" to "87654321"), listOf("Yann")), listOf("Not Found"))
        Assert.assertEquals(MyMap.search(hashMapOf("John" to "12345678", "Mick" to "87654321"), listOf("John","Mick","Yann")), listOf("John=12345678","Mick=87654321","Not Found"))
    }
}