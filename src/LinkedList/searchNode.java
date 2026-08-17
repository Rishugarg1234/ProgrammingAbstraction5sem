package LinkedList;

public class searchNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean searchNode(Node Head, int target) {
        Node temp = Head;

        while (temp != null) {
            if (temp.data == target) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {

        Node Head = new Node(10);
        Head.next = new Node(20);
        Head.next.next = new Node(30);
        Head.next.next.next = new Node(40);
        Head.next.next.next.next = new Node(50);

        System.out.println("Target Found : " + searchNode(Head, 30));
        System.out.println("Target Found : " + searchNode(Head, 300));
    }
}