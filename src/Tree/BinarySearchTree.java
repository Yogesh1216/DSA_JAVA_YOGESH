package Tree;

public class BinarySearchTree {

    Node root;

    public static class Node{
        Node left;
        int item;
        Node right;

        public Node(int data){
            left = null;
            item = data;
            right = null;
        }
    }

    public void insert(int data){
        Node n = new Node(data);

    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(20);
    }
}
