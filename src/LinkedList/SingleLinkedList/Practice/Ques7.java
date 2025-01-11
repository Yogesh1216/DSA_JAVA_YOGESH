package LinkedList.SingleLinkedList.Practice;

public class Ques7 {

/*
    7. **Find Nth Node from the End**
            - Use the two-pointer approach to find the Nth node from the end in a single pass.
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

        /*
             way1:
             1) cal length of link list.
             2) len-n+1 = last n'th node
         */
        public int lastNthNode(int n){

            int length = 0;
            Node temp = head;
            while(temp!=null){
                length++;
                temp = temp.next;
            }

            if(n>length || n<=0){
                return -1;
            }

            int targetIndex = length-n+1;
            temp = head;
            for(int i =0;i<targetIndex;i++){
                temp = temp.next;
            }
            return temp.item;
        }

    }


    public static void main(String[] args) {
        Sll sll = new Sll();
        sll.head = new Node(3);
        Node two = new Node(4);
        Node three = new Node(5);
        Node four = new Node(6);
        Node five = new Node(7);
        sll.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        sll.printLinkedList();
        int result = sll.lastNthNode(2);
        System.out.println(result);
    }
}
