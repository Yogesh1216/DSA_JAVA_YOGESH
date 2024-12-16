package Stack;

import java.util.EmptyStackException;

// stack using LinkedList:
public class stack {

    Node start;
    int itemCount;

    static class Node{
        int item;
        Node next;

        public Node(int data){
            item = data;
        }
    }

    public boolean isEmpty(){
        return start==null;
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println(start.item);
        }else{
            throw new EmptyStackException();
        }
    }

    public void push(int data){
        Node n = new Node(data);
        n.next = start;
        start = n;
        itemCount++;
    }

    public int pop(){
        if(!isEmpty()){
           int poppedItem = start.item;
           start = start.next;
           itemCount--;
            return poppedItem;
        }
        else {
            throw new EmptyStackException();
        }
    }

    public void printStack(){
        Node temp = start;
        if(!isEmpty()){
            while(temp!=null){
                System.out.print(temp.item+" -> ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public void sizeOfStack(){
        Node temp = start;
        int count=0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        stack st = new stack();
        st.start = new Node(5);
        st.push(6);
        st.push(7);
        st.printStack();
        int popedItem= st.pop();
        System.out.println(popedItem);
        //st.pop();

        st.peek();
        st.printStack();
        st.sizeOfStack();
    }
}
