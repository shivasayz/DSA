package BinaryTrees;

public class diameterOfTree {
    Node root;

    private int diameter = 0;

    public void insert(int val){
        root = insertRec(root, val);
    }

    public void findDiameter(){
        int res = findDiameterRec(root);
        System.out.println("Highest diameter: "+diameter);
    }

    private Node insertRec(Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        }

        if (val < root.data) root.left = insertRec(root.left, val);
        else if (val > root.data) root.right = insertRec(root.right, val);

        return root;
    }

    private int findDiameterRec(Node root){
        if (root == null) return 0;

        int lh = findDiameterRec(root.left);
        int rh = findDiameterRec(root.right);

        diameter = Math.max(diameter, lh+rh);
        return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        diameterOfTree obj = new diameterOfTree();
        int[] values = {25, 18, 45, 32, 52, 31, 30};

        for(int val: values){
            obj.insert(val);
        }
        obj.findDiameter();
    }
}
