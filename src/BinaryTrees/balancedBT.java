package BinaryTrees;

public class balancedBT {
    Node root;

    balancedBT(){
        root = null;
    }

    public void insert(int val){
        root = insertRec(root, val);
    }

    public void isValidBT(){
        int res = isValidBTRec(root);
        if (res != -1) System.out.println("Given BT is valid: "+res);
        else System.out.println("BT is not valid");
    }

    private int isValidBTRec(Node root){
        if (root == null) return 0;

        int lh = isValidBTRec(root.left);
        int rh = isValidBTRec(root.right);

        if (lh == -1 || rh == -1) return -1;
        if (Math.abs(rh - lh) > 1) return -1;

        return Math.max(lh, rh) + 1;

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
        balancedBT obj = new balancedBT();

        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(6);
        obj.insert(7);
        obj.insert(8);
        obj.insert(9);

        obj.isValidBT();
    }

}
