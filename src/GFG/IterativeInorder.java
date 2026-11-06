package GFG;
import java.util.*;
// GFG Problem Iterative Inorder
public class IterativeInorder {
    /*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};
*/
    class Solution {
        public ArrayList<Integer> inOrder(Node root) {
            // code here
            ArrayList<Integer>result = new ArrayList<>();
            Stack<Node>st = new Stack<>();
            Node curr = root;
            while(true){
                if(curr!=null){
                    st.push(curr);
                    curr=curr.left;
                }
                else{
                    if(st.isEmpty()){
                        break;
                    }
                    curr = st.pop();
                    result.add(curr.data);
                    curr=curr.right;
                }
            }
            return result;
        }
    }
}
