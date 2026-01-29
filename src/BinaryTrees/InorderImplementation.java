package BinaryTrees;

public class InorderImplementation {
    Node root;

    public InorderImplementation(){
        root = null;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    public void inOrder(){
        inOrderRec(root);
    }

    private Node insertRec(Node root, int key){
        if (root == null){
            root = new Node(key);
            return root;
        }

        if (key < root.data) root.left = insertRec(root.left, key);
        else if (key > root.data) root.right = insertRec(root.right, key);

        return root;
    }

    private void inOrderRec(Node root){
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public static void main(String[] args) {
        InorderImplementation inorder = new InorderImplementation();
        inorder.insert(2);
        inorder.insert(3);
        inorder.insert(4);
        inorder.insert(5);
        inorder.insert(6);

        inorder.inOrder();
    }
}
