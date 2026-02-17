package BinaryTrees;

public class MaxPathSum {
    Node root;
    private int maxSum = Integer.MIN_VALUE;

    public void insert(int val){
        root = insertRec(root, val);
    }

    public void findMaxPathSum(){
        int res = findMaxPathSumRec(root);
        System.out.println("Max sum: "+maxSum);
    }

    private int findMaxPathSumRec(Node root){
        if (root == null) return 0;

        int leftHeight = Math.max(0, findMaxPathSumRec(root.left));
        int rightHeight = Math.max(0, findMaxPathSumRec(root.right));

        maxSum = Math.max(maxSum, leftHeight + rightHeight + root.data);
        return root.data + Math.max(leftHeight, rightHeight);
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

    public static void main(String[] args) {
        MaxPathSum obj = new MaxPathSum();
        int[] values = {7, 3, 8, 1, 2, 9, 0, 10};
        for(int val: values){
            obj.insert(val);
        }
        obj.findMaxPathSum();
    }
}
