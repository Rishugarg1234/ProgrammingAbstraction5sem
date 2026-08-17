package LinkedList;

public class printLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void printList(Node Head){
        Node temp = Head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        Node Head = new Node(10);
        Head.next = new Node(20);
        Head.next.next = new Node(30);
        Head.next.next.next = new Node(40);
        Head.next.next.next.next = new Node(50);
        printList(Head);
    }
}
