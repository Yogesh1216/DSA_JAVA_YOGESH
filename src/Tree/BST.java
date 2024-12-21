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

    public void searchNode(int data){
        Node root1 = search(root,data);
        System.out.println(root1.item);
    }

    public Node search(Node root,int data){
        if(root==null || root.item == data){
            return root;
        }else{
            if(root.item>data){
                return search(root.left,data);
            }else{
                return search(root.right,data);
            }
        }
    }

    // find min value item node:


    // delete node - 1) node with no child , 2)node with 1 child , 3) node with 2 child.




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

        System.out.println("search node");
        bst.searchNode(8);
    }
}
