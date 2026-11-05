package GFG;
import java.util.*;
// Iterative PreOrder Traversal
public class IterativePreOrderTraversal {

    /* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/

    class Solution {
        ArrayList<Integer> preOrder(Node root) {
            // code here
            ArrayList<Integer>result = new ArrayList<>();
            Stack<Node>st = new Stack<>();
            st.push(root);
            while(!st.isEmpty()){
                Node curr = st.pop();
                result.add(curr.data);
                if(curr.right!=null){
                    st.push(curr.right);
                }
                if(curr.left!=null){
                    st.push(curr.left);
                }
            }
            return result;
        }
    }
}
