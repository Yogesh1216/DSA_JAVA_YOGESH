package LinkedList.SingleLinkedList.Practice;

public class Ques2 {

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

        public void insertAtStart(int data){
            Node n = new Node(data);
            if (head != null) {
                n.next = head;
            }
            head = n;
        }

        public void insertAtEnd(int data){
            Node n = new Node(data);
            if(head == null){
                head = n;
            }
            else{
                Node temp = head;
                while(temp.next!=null){
                    temp = temp.next;
                }
                temp.next = n;
            }
        }

        public void insertAfter(int findValue,int data){
            Node result = searchNode(findValue);
            if(result!=null){
                Node n = new Node(data);
                n.next = result.next;
                result.next=n;
            }else{
                System.out.println("your list does not have "+findValue);
            }
        }

        public Node searchNode(int data){
            Node temp = head;
            while(temp!=null){
                if(temp.item==data){
                    return temp;
                }else{
                    temp = temp.next;
                }
            }
            return null;
        }

        public void printLinkedList(){
            if(head!=null){
                Node temp = head;
                while(temp!=null){
                    System.out.println(temp.item);
                    temp = temp.next;
                }
            }
        }

    }
/*
    2. **Insert Node at the Beginning, End, and Middle**
            - Write functions to insert a node at the beginning, end, and a specific position in the list.
*/

    public static void main(String[] args) {
        Sll sll = new Sll();
        sll.insertAtStart(4);
        sll.insertAtEnd(6);
        sll.insertAfter(4,5);
        sll.insertAfter(6,5);
        sll.printLinkedList();
    }
}




