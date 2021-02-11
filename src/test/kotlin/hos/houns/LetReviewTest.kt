package hos.houns

import org.junit.Assert
import org.junit.Test

/**
 * @author : hospicehounsou
 * @created : 11/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 */
internal class LetReviewTest{

    @Test
    fun test(){
        Assert.assertEquals(LetReview.review(""),"")
        Assert.assertEquals(LetReview.review("a"),"a")
        Assert.assertEquals(LetReview.review("ab"),"a  b")
        Assert.assertEquals(LetReview.review("abc"),"ac  b")
        Assert.assertEquals(LetReview.review("Hacker"),"Hce  akr")

    }
}