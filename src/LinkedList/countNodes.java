package LinkedList;

public class countNodes {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int countNodeOfLinkedList(Node Head) {
        Node temp = Head;
        int count = 0;

        while (temp != null) {
            count += 1;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {

        Node Head = new Node(10);
        Head.next = new Node(20);
        Head.next.next = new Node(30);
        Head.next.next.next = new Node(40);
        Head.next.next.next.next = new Node(50);

        System.out.println(
                "Total Number of nodes: " + countNodeOfLinkedList(Head)
        );
    }
}