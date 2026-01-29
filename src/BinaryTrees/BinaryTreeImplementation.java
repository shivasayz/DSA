package BinaryTrees;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int key){
        this.data = key;
        left = right = null;
    }
}

public class BinaryTreeImplementation {
    Node root;

    public BinaryTreeImplementation(){
        root = null;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    public void inorder(){
        inorderRec(root);
    }

    private Node insertRec(Node root, int key){
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) root.left = insertRec(root.left, key);
        else if(key > root.data) root.right = insertRec(root.right, key);

        return root;
    }

    private void inorderRec(Node root){
        if (root != null){
            inorderRec(root.left);
            System.out.print(root.data+" ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeImplementation bt = new BinaryTreeImplementation();
        bt.insert(10);
        bt.insert(20);
        bt.insert(30);
        bt.insert(40);
        bt.insert(50);
        bt.insert(60);
        bt.insert(70);

        bt.inorder();
    }
}
