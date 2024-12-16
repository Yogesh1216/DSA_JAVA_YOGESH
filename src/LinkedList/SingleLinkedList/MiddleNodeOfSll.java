package LinkedList.SingleLinkedList;

public class MiddleNodeOfSll {

    Node head;

    public static class Node{
        int item;
        Node next;

        public Node(int data){
            item = data;
            next = null;
        }
    }

    public void printNodes(){
        Node current = head;
        while(current!=null){
            System.out.println(current.item);
            current = current.next;
        }
    }

    public Node middleNode(){
        Node slowPtr = head;
        Node fastPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }



    public static void main(String[] args) {
        MiddleNodeOfSll sll = new MiddleNodeOfSll();
        sll.head = new Node(3);
        Node second = new Node(4);
        Node third = new Node(5);
        Node fourth = new Node(6);
        Node fifth = new Node(7);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next=fifth;
        sll.printNodes();
        Node mid = sll.middleNode();
        System.out.println(mid.item);

    }
}
