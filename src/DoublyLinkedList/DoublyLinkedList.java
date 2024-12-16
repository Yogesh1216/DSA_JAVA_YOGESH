package DoublyLinkedList;

public class DoublyLinkedList {

    Node head;

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
        if(!isEmpty()){
            Node current = head;
            while(current!=null){
                System.out.print(current.item+" -> ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public void insertAtStart(int data){
        Node n = new Node(data);
        if(isEmpty()){
            head = n;
        }else{
            n.next=head;
            head = n;
        }
    }

    public void insertAtEnd(int data){
        Node n = new Node(data);
        if(isEmpty()){
            head = n;
        }else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next=n;
        }
    }

    public Node searchNode(int data){
        Node current = head;
        if(!isEmpty()){
            while(current!=null && current.item!=data){
                current = current.next;
            }
        }
        return current;
    }

    public void insertAfter(int insertafter,int data){
        Node n = new Node(data);
        if(isEmpty()){
            head = n;
        }else{
            Node current = searchNode(insertafter);
            if(current.next!=null){
                n.next=current.next;
                current.next.prev = n;
                current.next=n;
                n.prev = current;
            }else{
                current.next=n;
                n.prev = current;
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtStart(5);
        dll.insertAtEnd(6);
        dll.insertAtStart(4);
        dll.printAllNodes();
        Node result = dll.searchNode(5);
        //System.out.println(result.item);
        dll.insertAfter(6,7);
        dll.printAllNodes();
    }
}
