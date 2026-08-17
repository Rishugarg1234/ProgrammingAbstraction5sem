package LinkedList;

public class reverseLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while (curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;

        }
    }

    public static void main(String []args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        System.out.println("Original list: ");
        printList(head);
        head = reverse(head);
        System.out.println("reversed List: ");
        printList(head);

    }
}
