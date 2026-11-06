package Trees;
import java.util.*;
public class PreInPostTraversal {


    public class Main {

        // Pair class: node + state
        static class Pair {
            Node node;
            int num;

            Pair(Node node, int num) {
                this.node = node;
                this.num = num;
            }
        }

        // Binary Tree Node
        static class Node {
            int data;
            Node left, right;

            Node(int data) {
                this.data = data;
                left = right = null;
            }
        }

        public static void preInPostTraversal(Node root) {
            ArrayList<Integer>preOrder = new ArrayList<>();
            ArrayList<Integer>inOrder = new ArrayList<>();
            ArrayList<Integer>postOrder = new ArrayList<>();
            Stack<Pair>st = new Stack<>();
            if(root==null){
                return;
            }
            st.push(new Pair(root,1));
            while(!st.isEmpty()){
                Pair p = st.pop();
                if(p.num==1){
                    preOrder.add(p.node.data);
                    p.num++;
                    st.push(p);

                    if(p.node.left!=null){
                        st.push(new Pair(p.node.left,1));
                    }
                }
                else if(p.num==2){
                    inOrder.add(p.node.data);
                    p.num++;
                    st.push(p);
                    if(p.node.right!=null){
                        st.push(new Pair(p.node.right,1));
                    }
                }
                else{
                    postOrder.add(p.node.data);
                }
            }

            // Print all three traversals
            System.out.println("Preorder  : " + preOrder);
            System.out.println("Inorder   : " + inOrder);
            System.out.println("Postorder : " + postOrder);
        }

        public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \
             4   5
        */

            Node root = new Node(1);

            root.left = new Node(2);
            root.right = new Node(3);

            root.left.left = new Node(4);
            root.left.right = new Node(5);

            preInPostTraversal(root);
        }
    }
}
