package BinaryTrees;

public class PostOrderTraversal {
    Node root;

    PostOrderTraversal(){
        root = null;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    public void postOrder(){
        postOrderRec(root);
    }

    private void postOrderRec(Node root){
        if (root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data+" ");
        }
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

    public static void main(String[] args) {
        PostOrderTraversal pot = new PostOrderTraversal();
        pot.insert(30);
        pot.insert(25);
        pot.insert(45);
        pot.insert(15);
        pot.insert(29);
        pot.insert(35);
        pot.insert(49);

        pot.postOrder();
    }
}
