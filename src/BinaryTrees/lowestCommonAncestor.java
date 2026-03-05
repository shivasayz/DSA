package BinaryTrees;

public class lowestCommonAncestor {

    Node root;

    public Node insert(int val){
        return root = insertRec(root, val);
    }

    public int printLowestAncestor(int p, int q){
        Node lca = findLowestAncestor(root, p, q);
        return lca != null ? lca.data : -1;
    }

    private Node findLowestAncestor(Node root, int p, int q){

        if (root == null) return null;

        if (p < root.data && q < root.data)
            return findLowestAncestor(root.left, p, q);

        if (p > root.data && q > root.data)
            return findLowestAncestor(root.right, p, q);

        return root;
    }

    private Node insertRec(Node root, int val) {

        if (root == null){
            root = new Node(val);
            return root;
        }

        if (val < root.data)
            root.left = insertRec(root.left, val);

        else if (val > root.data)
            root.right = insertRec(root.right, val);

        return root;
    }

    public static void main(String[] args) {

        lowestCommonAncestor tree = new lowestCommonAncestor();

        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(5);
        tree.insert(15);
        tree.insert(25);
        tree.insert(35);

        int p = 5;
        int q = 15;

        System.out.println("Lowest Common Ancestor: " + tree.printLowestAncestor(p, q));
    }
}