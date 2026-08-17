package LinkedList;

public class MiddleNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int MiddleNodeOfLinkedList(Node Head) {

        Node slow = Head;
        Node fast = Head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {

        Node Head = new Node(10);
        Head.next = new Node(20);
        Head.next.next = new Node(30);
        Head.next.next.next = new Node(40);
        Head.next.next.next.next = new Node(50);

        System.out.println(
                "Middle Node: " + MiddleNodeOfLinkedList(Head)
        );
    }
}