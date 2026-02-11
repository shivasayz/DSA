package BinaryTrees;

public class PreOrderTraversalRec {
    Node root;

    public PreOrderTraversalRec(){
        root = null;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    public void preOrder(){
        preOrderRec(root);
    }

    private void preOrderRec(Node root){
        if (root != null){
            System.out.print(root.data+" ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    private Node insertRec(Node root, int key){
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) root.left = insertRec(root.left, key);
        else if (key > root.data) root.right = insertRec(root.right, key);

        return root;
    }

    public static void main(String[] args) {
        PreOrderTraversalRec pt = new PreOrderTraversalRec();
        pt.insert(30);
        pt.insert(25);
        pt.insert(45);
        pt.insert(15);
        pt.insert(29);
        pt.insert(42);

        pt.preOrder();
    }

}
