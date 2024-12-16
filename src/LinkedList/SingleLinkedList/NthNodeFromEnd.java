package LinkedList.SingleLinkedList;

public class NthNodeFromEnd {

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

    public Node nthNodeFromEnd(int n){
        Node current = head;
        Node ref = head;

        int count=0;
        while(count<n){
            ref = ref.next;
            count++;
        }
        while(ref!=null){
            ref = ref.next;
            current = current.next;
        }
        return current;
    }


    public static void main(String[] args) {
        NthNodeFromEnd sll = new NthNodeFromEnd();
        sll.head = new NthNodeFromEnd.Node(3);
        NthNodeFromEnd.Node second = new NthNodeFromEnd.Node(4);
        NthNodeFromEnd.Node third = new NthNodeFromEnd.Node(5);
        NthNodeFromEnd.Node fourth = new NthNodeFromEnd.Node(6);
        NthNodeFromEnd.Node fifth = new NthNodeFromEnd.Node(7);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next=fifth;
        sll.printNodes();

        // find nth node from end:
        Node result =sll.nthNodeFromEnd(2);
        System.out.println("Last 2nd node is: "+result.item);
    }
}
