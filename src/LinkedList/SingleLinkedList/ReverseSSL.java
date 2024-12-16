package LinkedList.SingleLinkedList;

public class ReverseSSL {

    Node start = null;

    public static class Node{
        int item;
        Node next;

        public Node(int data){
            this.item = data;
            this.next = null;
        }
    }

    public void printSSL(){
        Node current = start;
        while(current!=null){
            System.out.print(current.item+" ");
            current = current.next;
        }
    }

    public void reverseList(Node start){
        Node current = start;
        Node prev = null;
        Node next = null;
        while(current !=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    }

    public static void main(String[] args) {
        ReverseSSL ssl = new ReverseSSL();
        ssl.start = new Node(4);
        Node second = new Node(6);
        Node third = new Node(8);
        Node fourth = new Node(10);
        ssl.start.next = second;
        second.next = third;
        third.next = fourth;
        ssl.printSSL();
        // 10 8 6 4


    }

}
