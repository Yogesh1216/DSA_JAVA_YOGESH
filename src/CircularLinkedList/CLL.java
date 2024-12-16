package CircularLinkedList;

import java.io.FilterOutputStream;

public class CLL {

    Node last;
    public static class Node{
        int item;
        Node next;

        public Node(int data){
            item = data;
            next = null;
        }
    }

    public boolean isEmpty(){
        return last==null;
    }

    public void insertAtStart(int data){
        Node n = new Node(data);
        if(isEmpty()){
            last = n;
            n.next=last;
        }else{
            n.next=last.next;
            last.next=n;
        }
    }

    public void insertAtEnd(int data){
        Node n = new Node(data);
        if(isEmpty()){
            last = n;
            n.next=last;
        }else{
            n.next=last.next;
            last.next=n;
            last=n;
        }
    }

    public void deleteFirstNode(){
        if(!isEmpty()){
            if(last==last.next){
                last=null;
            }else{
                last.next = last.next.next;
            }
        }
    }

    public void deleteLastNode(){
        if(!isEmpty()){
            if(last==last.next){
                last=null;
            }else{
                Node temp = last.next;
                while(temp.next!=last){
                    temp = temp.next;
                }
                temp.next = last.next;
                last=temp;
            }
        }
    }

    public void printNodes(){
        Node temp = last.next;
        while(temp!=last){
            System.out.print(temp.item+" -> ");
            temp=temp.next;
        }
        System.out.println(temp.item);
    }

    public static void main(String[] args) {
        CLL cll = new CLL();
        Node first = new Node(3);
        Node second = new Node(5);
        Node third = new Node(7);
        cll.last = new Node(8);
        cll.last.next = first;
        first.next=second;
        second.next=third;
        third.next=cll.last;

        cll.insertAtStart(1);
        cll.insertAtEnd(9);
        cll.deleteFirstNode();
        cll.deleteLastNode();
        cll.printNodes();



    }
}
