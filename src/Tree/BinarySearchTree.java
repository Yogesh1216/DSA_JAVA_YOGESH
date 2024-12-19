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

    // pre-order traversing:
    public void preOrderTraversing(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.item);
        preOrderTraversing(root.left);
        preOrderTraversing(root.right);
    }

    // in-order traversing:
    public void inOrderTraversing(Node root){
        if(root==null){
            return;
        }
        inOrderTraversing(root.left);
        System.out.println(root.item);
        inOrderTraversing(root.right);
    }

    // post-order traversing:
    public void postOrderTraversing(Node root){
        if(root==null){
            return;
        }
        postOrderTraversing(root.left);
        postOrderTraversing(root.right);
        System.out.println(root.item);
    }

//    public void insert(int data){
//        Node n = new Node(data);
//
//    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        bst.root.left = second;
        second.left = fourth;
        second.right = fifth;
        bst.root.right = third;

        System.out.println("preOrderTraversing");
        bst.preOrderTraversing(bst.root);
        System.out.println("inOrderTraversing");
        bst.inOrderTraversing(bst.root);
        System.out.println("postOrderTraversing");
        bst.postOrderTraversing(bst.root);

    }
}
