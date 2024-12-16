package LinkedList.SingleLinkedList;
//
//
//public class SingleLinkedList {
//
//    Node head;
//
//    static class Node{
//        int item;
//        Node next;
//
//        public Node(int data){
//            this.item = data;
//            this.next = null;
//        }
//    }
//
//    public void addFirst(int data){
//        Node n = new Node(data);
//        if(head == null){
//            head = n;
//        }
//        else{
//            n.next = head;
//            head = n;
//        }
//    }
//
//    public void addLast(int data){
//        Node n = new Node(data);
//        if(head == null){
//            head = n;
//        }else{
//            Node temp = head;
//            while(temp.next != null){
//                temp = temp.next;
//            }
//            temp.next=n;
//        }
//    }
//
//    public void printLinkedList(){
//        if(head!=null){
//            Node n = head;
//            while(n!=null){
//                System.out.println(n.item);
//                n = n.next;
//            }
//        }
//        else{
//            System.out.println("linked list is empty");
//        }
//    }
//
//    public static void main(String[] args) {
//        SingleLinkedList sll = new SingleLinkedList();
//        sll.addFirst(10);
//        sll.addFirst(3);
//        sll.addFirst(5);
//        sll.addLast(12);
//        sll.addLast(15);
//        sll.printLinkedList();
//    }
//}







class Node{
    int item;
    Node next;

    public Node(int data){
        this.item = data;
        this.next = null;
    }
}


class SLL{
    Node start = null;

    public void printLinkedList(){
        Node temp = start;
        while(temp!=null){
            System.out.println(temp.item);
            temp = temp.next;
        }
    }

    public void insertAtStart(int data){
        Node n = new Node(data);
        if(this.start==null){
            this.start = n;
        }else{
            n.next = start;
            start = n;
        }
    }

    public void insertAtEnd(int data){
        Node n = new Node(data);
        if(start==null){
            this.start = n;
        }else{
            Node temp = start;
            while(temp.next !=null) {
                temp = temp.next;
            }
                temp.next = n;
            }
    }

    public Node searchItem(int data){
        Node temp = start;
            while(temp!=null){
                if(temp.item==data){
                    return temp;
                }
                temp = temp.next;
            }
        return null;
    }

    public void insertAfter(int insertAfter , int data){
        Node n = searchItem(insertAfter);
        if(n != null){
            Node newNode = new Node(data);
            newNode.next = n.next;
            n.next = newNode;
        }
    }

    public void deleteFirst(){
        if(start!=null){
            start = start.next;
        }
    }

    public void deleteLast(){
        if(start != null){
            Node temp = start;
            if(temp.next==null){
                start = null;
            }
            else{
                while(temp.next.next!=null){
                    temp = temp.next;
                }
                temp.next=null;
            }

        }
    }

    public void deleteSpecific(int data){
        if(start != null){
            if(start.item == data){
                start = start.next;
            }else{
                Node temp = start;
                while(temp.next!=null){
                    if(temp.next.item == data){
                        temp.next= temp.next.next;
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
    }


}

class Program{

    public static void main(String[] args) {
        SLL obj = new SLL();
        obj.insertAtStart(5);
//        obj.insertAtStart(4);
        obj.insertAtEnd(6);
        obj.insertAfter(6,7);
        //obj.deleteFirst();
        //obj.deleteLast();
        obj.deleteSpecific(5);
        obj.printLinkedList();
    }
}















