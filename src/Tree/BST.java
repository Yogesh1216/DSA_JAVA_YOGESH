package Tree;

public class BST {

    Node root;

    public static class Node{
        Node left;
        int item;
        Node right;
        public Node(int data){
            item = data;
        }
    }

    public void preOrderTraversing(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.item);
        preOrderTraversing(root.left);
        preOrderTraversing(root.right);
    }

    public void insertData(int data){
        root = rinsertData(root , data);
    }

    public Node rinsertData(Node root , int data){
        if(root==null){
            return new Node(data);
        }else{
            if(data<root.item){
                root.left = rinsertData(root.left,data);
            }else if(data>root.item){
                root.right = rinsertData(root.right,data);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        BST bst = new BST();
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

        bst.insertData(8);
        System.out.println("preOrderTraversing");
        bst.preOrderTraversing(bst.root);
    }
}
