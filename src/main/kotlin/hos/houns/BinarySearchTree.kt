package hos.houns

/**
 * @author : hospicehounsou
 * @created : 22/02/2021
 * @linkedin: https://www.linkedin.com/in/hospicehounsou/
 **/
class BinarySearchTree {
    data class Node(var value :Int=0){
         var left: Node? = null
        var right: Node? = null
    }

    fun insert(node :Node?, value: Int): Node {
        node?.let {
            if (value < node.value){
                node.left= insert(node.left,value)
            } else if (value > node.value){
                node.right = insert(node.right, value)
            }
            return node
        }?: kotlin.run {
            return  createNewNode(value)

        }
    }

    private fun createNewNode(value: Int): Node {
       val node= Node()
        node.value =value
        node.left=null
        node.right=null
        return node
    }

}

fun main(){
    val bst =BinarySearchTree()
    var root :BinarySearchTree.Node? =null
    root = bst.insert(root,8)
    root = bst.insert(root,3)
    root = bst.insert(root,6)
    root = bst.insert(root,10)
    root = bst.insert(root,4)
    root = bst.insert(root,7)
    root = bst.insert(root,1)
    root = bst.insert(root,14)
    root = bst.insert(root,13)
    // 8, 3, 6, 10, 4, 7, 1, 14,13
    println(root)


}