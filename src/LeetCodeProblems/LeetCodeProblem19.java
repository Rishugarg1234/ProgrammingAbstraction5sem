package LeetCodeProblems;

/*
 * LeetCode 19: Remove Nth Node From End of List
 *
 * Approach:
 * Use two pointers (slow and fast) with a dummy node.
 * The fast pointer is kept n nodes ahead of the slow pointer.
 * When fast reaches the end, slow will be just before the node
 * that needs to be removed.
 *
 * Time Complexity: O(L)
 * Space Complexity: O(1)
 */

public class LeetCodeProblem19 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Dummy node helps handle the case when the head itself is removed
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move fast pointer n+1 steps ahead
        // This creates a gap of n nodes between slow and fast
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        // slow will point to the node just before the target node
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        // Return the actual head, skipping the dummy node
        return dummy.next;
    }
}