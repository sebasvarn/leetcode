package Easy;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class BST {

    public class TreeNode{
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val){
            this.val = val;
        }

        TreeNode root = null;
    }


    TreeNode root = null;

    /*
    recursive approach
    if (root == null)
        return

    inorder(root.left)
    print(root.data)
    inorder(root.right)

    iterative approach
    Create an empty stack (say S).
    Initialize the current node as root.
    Push the current node to S and set current = current->left until current is NULL
    If current is NULL and the stack is not empty then:
    Pop the top item from the stack.
    Print the popped item and set current = popped_item->right
    Go to step 3.
    If current is NULL and the stack is empty then we are done.
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> inorder= new Stack<>();
        List<Integer> lista = new ArrayList<>();
        if (root == null){
            return lista;
        }
        TreeNode current = root;

        while(current != null || !inorder.empty()){
            while ( current != null){
                inorder.push(current);
                current = current.left;
            }
            current = inorder.pop();
            lista.add(current.val);
            current = current.right;
        }
        return lista;
    }


}
