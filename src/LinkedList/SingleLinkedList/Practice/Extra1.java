package LinkedList.SingleLinkedList.Practice;

public class Extra1 {

    static class Node{
        int item;
        Node next;

        public Node(int data){
            item = data;
        }
    }

    static class Sll{
        Node head;

        public void printList(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.item+ " ");
                temp = temp.next;
            }
        }

        public void deleteNodeFromEnd(int n){
            Node fast = head;
            Node slow = head;
            for(int i=1;i<n+1;i++){
                fast = fast.next;
            }
            while(fast.next!=null){
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            System.out.println();
            printList();
        }
    }

    // delete nth node from end with one traversal.
    public static void main(String[] args) {
        Sll sll = new Sll();
        sll.head = new Node(3);
        Node two = new Node(4);
        Node three = new Node(5);
        Node four = new Node(6);
        Node five = new Node(7);
        Node six = new Node(8);
        sll.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        sll.printList();
        sll.deleteNodeFromEnd(1);
    }
}
