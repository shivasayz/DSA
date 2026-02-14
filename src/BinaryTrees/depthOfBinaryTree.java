package BinaryTrees;

public class depthOfBinaryTree {
    Node root;

    depthOfBinaryTree(){
        root = null;
    }

    public void depthOfTree(){
        int res = depthOfTreeRec(root);
        System.out.println("Depth of BT: "+res);
    }

    private int depthOfTreeRec(Node root){
        if (root == null) return 0;

        int lh = depthOfTreeRec(root.left);
        int rh = depthOfTreeRec(root.right);

        return 1 + Math.max(lh, rh);
    }

    public void insert(int val){
        root = insertRec(root, val);
    }

    private Node insertRec(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) root.left = insertRec(root.left, val);
        else if (val > root.data) root.right = insertRec(root.right, val);

        return root;
    }

    public static void main(String[] args) {
        depthOfBinaryTree obj = new depthOfBinaryTree();
        obj.insert(25);
        obj.insert(18);
        obj.insert(45);
        obj.insert(32);
        obj.insert(52);
        obj.insert(31);
        obj.insert(30);

        obj.depthOfTree();
    }
}
