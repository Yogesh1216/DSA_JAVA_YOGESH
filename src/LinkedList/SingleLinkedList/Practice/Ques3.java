package LinkedList.SingleLinkedList.Practice;

public class Ques3 {

/*
    3. **Delete Node by Value or Position**
            - Remove a node from the list by its value or position.
*/

    static class Node{
        int item;
        Node next;

        public Node(int data){
            item = data;
            next = null;
        }
    }

    static class Sll{
        Node head;

        public void printLinkedList(){
            if(head!=null){
                Node temp = head;
                while(temp!=null){
                    System.out.println(temp.item);
                    temp=temp.next;
                }
            }
        }

        public void deleteNode(int data){
            if(head.item==data){
                head = null;
            }else{
                Node temp = head;
                while(temp.next!=null){
                    if(temp.next.item==data){
                        temp.next = temp.next.next;
                        return;
                    }
                    temp=temp.next;
                }
            }
        }

    }



    public static void main(String[] args) {
        Sll sll = new Sll();
        sll.head = new Node(3);
        Node two = new Node(4);
        Node three = new Node(5);
        Node four = new Node(6);
        sll.head.next = two;
        two.next = three;
        three.next = four;
        sll.printLinkedList();

        sll.deleteNode(6);
        sll.printLinkedList();
    }
}
