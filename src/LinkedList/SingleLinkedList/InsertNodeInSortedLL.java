package LinkedList.SingleLinkedList;

public class InsertNodeInSortedLL {

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

    public void insertNode(int data){
        Node n = new Node(data);
        Node prev = null;
        Node current = head;
        while(current!=null && current.item<data){
            prev = current;
            current = current.next;
        }
        n.next=current;
        prev.next=n;
    }


    public static void main(String[] args) {
        InsertNodeInSortedLL sll = new InsertNodeInSortedLL();
        sll.head = new InsertNodeInSortedLL.Node(3);
        InsertNodeInSortedLL.Node second = new InsertNodeInSortedLL.Node(4);
        InsertNodeInSortedLL.Node third = new InsertNodeInSortedLL.Node(6);
        InsertNodeInSortedLL.Node fourth = new InsertNodeInSortedLL.Node(7);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
//        sll.printNodes();
        sll.insertNode(5);
        sll.printNodes();
    }
}
