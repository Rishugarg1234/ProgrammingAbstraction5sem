package LeetCodeProblems;
// LeetCode Problem328 Odd Even Linked List
public class LeetCodeProblem328 {
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
        public ListNode oddEvenList(ListNode head) {
            if(head==null || head.next==null){
                return head;
            }
            ListNode evenDummy = new ListNode(0);
            ListNode oddDummy = new ListNode(0);
            ListNode even = evenDummy;
            ListNode odd = oddDummy;
            int position=1;
            ListNode curr=head;
            while(curr!=null){
                if(position%2==0){
                    even.next=curr;
                    even=even.next;
                }
                else{
                    odd.next = curr;
                    odd=odd.next;
                }
                position++;
                curr=curr.next;
            }
            even.next=null;
            odd.next=evenDummy.next;
            return oddDummy.next;
        }
    }
}
