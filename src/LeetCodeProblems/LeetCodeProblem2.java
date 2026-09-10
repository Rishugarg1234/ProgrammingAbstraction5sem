package LeetCodeProblems;
// LeetCode 2 = Add Two Numbers

public class LeetCodeProblem2 {


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0;
        while(temp1!=null||temp2!=null||carry!=0){
            int sum = carry;
            if(temp1!=null){
                sum+=temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null){
                sum+=temp2.val;
                temp2=temp2.next;
            }
            int digit = sum%10;
            carry = sum/10;

            current.next = new ListNode(digit);
            current = current.next;
        }
        return dummy.next;
    }
}
