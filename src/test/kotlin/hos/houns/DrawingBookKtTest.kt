package hos.houns

import org.junit.Assert
import kotlin.math.min

class DrawingBookKtTest{
    @org.junit.Test
    fun test(){
        Assert.assertEquals(pageCount(1,1) , 0)
        Assert.assertEquals(pageCount(2,1) , 0)
        Assert.assertEquals(pageCount(2,2) , 0)
        Assert.assertEquals(pageCount(3,1) , 0)
        Assert.assertEquals(pageCount(3,3) , 0)
        Assert.assertEquals(pageCount(4,3) , 1)
        Assert.assertEquals(pageCount(4,4) , 0)
        Assert.assertEquals(pageCount(5,4) , 0)
        Assert.assertEquals(pageCount(5,5) , 0)
        Assert.assertEquals(pageCount(11,4) , 2)
    }

    private fun pageCount(numberOfpages: Int, pageToOpen: Int): Int {
        return  DrawingBook.pageCount(numberOfpages, pageToOpen)
    }

}