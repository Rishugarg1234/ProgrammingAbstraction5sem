package LeetCodeProblems;
import java.util.*;
//LeetCode Problem 124 : Binary Tree Maximum Sum
public class LeetCodeProblem124 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public int maxPathSum(TreeNode root) {
            int maxVal[] = new int[1];
            maxVal[0] = Integer.MIN_VALUE;
            maxPath(root,maxVal);
            return maxVal[0];
        }
        public int maxPath(TreeNode root, int maxVal[]){
            if(root==null){
                return 0;
            }
            int lh = Math.max(0,maxPath(root.left,maxVal));
            int rh = Math.max(0,maxPath(root.right,maxVal));

            maxVal[0] = Math.max(maxVal[0],root.val+lh+rh);
            return root.val+Math.max(lh,rh);
        }
    }
}
