package LeetCodeProblems;
//LeetCode Problem 25 : Reverse Nodes in K-Group
public class LeetCodeProblem25 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode temp = head;
            for(int i=0;i<k;i++){
                if(temp==null){
                    return head;
                }
                temp=temp.next;
            }
            ListNode curr=head;
            ListNode prev=null;
            ListNode next = null;
            for(int i=0;i<k;i++){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head.next = reverseKGroup(curr,k);
            return prev;
        }
    }
}
