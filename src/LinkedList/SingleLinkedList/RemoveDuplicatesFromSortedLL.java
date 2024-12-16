package LinkedList.SingleLinkedList;

public class RemoveDuplicatesFromSortedLL {

    Node head;

    public static class Node{
        int item;
        Node next;

        public Node(int data){
            item = data;
            next = null;
        }
    }

    public void printSSL(){
        Node current = head;
        while(current!=null){
            System.out.print(current.item+" ");
            current = current.next;
        }
    }

    public void deleteDuplicateNodes(){
        Node current = head;
        Node prev = null;
        while (current!=null){
            prev = current;
            current = current.next;
            if(prev.item == current.item){
                current = current.next;
                prev.next = current;
            }
        }
    }

    public void deleteDuplicates(){
        Node current = head;
        while(current!=null && current.next!=null){
            if(current.item == current.next.item){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
    }


    public static void main(String[] args) {
        RemoveDuplicatesFromSortedLL ssl = new RemoveDuplicatesFromSortedLL();
        ssl.head = new RemoveDuplicatesFromSortedLL.Node(1);
        RemoveDuplicatesFromSortedLL.Node second = new RemoveDuplicatesFromSortedLL.Node(1);
        RemoveDuplicatesFromSortedLL.Node third = new RemoveDuplicatesFromSortedLL.Node(2);
        RemoveDuplicatesFromSortedLL.Node fourth = new RemoveDuplicatesFromSortedLL.Node(3);
        RemoveDuplicatesFromSortedLL.Node fifth = new RemoveDuplicatesFromSortedLL.Node(3);
        ssl.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next=fifth;
        ssl.deleteDuplicates();
        ssl.printSSL();
    }
}
