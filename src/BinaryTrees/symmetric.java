package BinaryTrees;

public class symmetric {
    Node root;

    public Node insert(int val){
        return root = insertRec(root, val);
    }

    public boolean isSymmetric(Node root){
        return root == null || isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(Node left, Node right){
        if (left == null || right == null){
            return left == right;
        }

        if (left.data != right.data) return false;

        return isSymmetricHelp(left.left, right.right)
                && isSymmetricHelp(left.right, right.left);
    }

    private Node insertRec(Node root, int val){
        if (root == null){
            return new Node(val);
        }

        if (val < root.data)
            root.left = insertRec(root.left, val);
        else if (val > root.data)
            root.right = insertRec(root.right, val);

        return root;
    }

    public static void main(String[] args) {

        // --------- Example 1: Manually Built Symmetric Tree ---------
        symmetric obj1 = new symmetric();

        obj1.root = new Node(1);
        obj1.root.left = new Node(2);
        obj1.root.right = new Node(2);
        obj1.root.left.left = new Node(3);
        obj1.root.left.right = new Node(4);
        obj1.root.right.left = new Node(4);
        obj1.root.right.right = new Node(3);

        System.out.println("Manually Built Tree is Symmetric: "
                + obj1.isSymmetric(obj1.root));

        // --------- Example 2: BST Insert ---------
        symmetric obj2 = new symmetric();

        int[] values = {4, 2, 6, 1, 3, 5, 7};

        for (int val : values) {
            obj2.insert(val);
        }

        System.out.println("BST Built Tree is Symmetric: "
                + obj2.isSymmetric(obj2.root));
    }
}