package hos.houns.daysOflearn

import org.junit.Assert
import org.junit.Test


/**
 * @author : hospicehounsou
 * @created : 17/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 */
internal class BinaryTreeTest{

    @Test
    fun test(){
     Assert.assertEquals(BinaryTree.count(0),0)
     Assert.assertEquals(BinaryTree.count(1),1)
     Assert.assertEquals(BinaryTree.count(2),1)
     Assert.assertEquals(BinaryTree.count(3),2)
     Assert.assertEquals(BinaryTree.count(4),1)
     Assert.assertEquals(BinaryTree.count(5),1)
     Assert.assertEquals(BinaryTree.count(6),2)
     Assert.assertEquals(BinaryTree.count(7),3)
     Assert.assertEquals(BinaryTree.count(8),1)
    }
}