package GFG;
import java.util.*;
// GFG : Iterative PostOrder
public class IterativePostOrder {
    /* Binary Tree Node Structure
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
    class Solution {
        ArrayList<Integer> postOrder(Node root) {
            // code here
            Stack<Node>s1=new Stack<>();
            Stack<Node>s2=new Stack<>();
            ArrayList<Integer>list = new ArrayList<>();
            s1.push(root);
            while(!s1.isEmpty()){
                Node curr  = s1.pop();
                s2.push(curr);
                if(curr.left!=null){
                    s1.push(curr.left);
                }
                if(curr.right!=null){
                    s1.push(curr.right);
                }
            }
            while(!s2.isEmpty()){
                list.add(s2.pop().data);
            }
            return list;
        }
    }
}
