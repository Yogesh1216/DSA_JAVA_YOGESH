package LinkedList.SingleLinkedList.Practice;

public class Ques1 {
    static class Node{
        int item;
        Node next;

        public Node(int data){
            item = data;
            next = null;
        }
    }

    static class SLL{
        Node head;

        public void addElement(int data){
            Node n = new Node(data);
            if(head==null){
                head=n;
            }else{
                Node temp = head;
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next=n;
            }
        }

        public void printLinkedList(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.item);
                temp = temp.next;
            }
        }

    }

/*
    1. **Create and Print a Linked List**
            - Implement a function to create a single linked list.
   - Traverse and print the elements.
*/
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.addElement(5);
        sll.addElement(6);
        sll.printLinkedList();
    }
}
