package DoublyLinkedList;

public class DLL {

    Node head;
    Node tail;

    static class Node{
        Node prev;
        int item;
        Node next;

        public Node(int data){
            item = data;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printAllNodes(){
        Node current = head;
        while(current!=null){
            System.out.print(current.item+" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public void insertAtStart(int data){
        Node n = new Node(data);
        if(isEmpty()){
            head = n;
        }else{
            n.next = head;
            head.prev = n;
            head=n;
        }
    }

    public void insertAtEnd(int data){
        Node n = new Node(data);
        if(isEmpty()){
            head=n;
        }else{
            n.prev = tail;
            tail.next = n;
        }
    }

    public void deleteFirstNode(){
        if(!isEmpty()){
            head.next.prev=head;
            head = head.next;
        }
    }

    public void deleteLastNode(){
        if(!isEmpty()){
            tail.prev.next=null;
            tail.prev = null;
        }
    }


    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.head = new Node(3);
        Node second = new Node(7);
        Node third = new Node(5);
        dll.tail = new Node(8);

        dll.head.next = second;
        second.prev = dll.head;
        second.next = third;
        third.prev = second;
        third.next = dll.tail;
        dll.tail.prev = third;

        dll.insertAtStart(1);
        dll.insertAtEnd(9);
       // dll.deleteFirstNode();
        dll.deleteLastNode();
        dll.printAllNodes();
    }
}
