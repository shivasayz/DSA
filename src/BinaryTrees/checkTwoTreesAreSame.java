package BinaryTrees;

public class checkTwoTreesAreSame {

    public Node insert(Node root, int val){
        return insertRec(root, val);
    }

    public boolean isIdentical(Node tree1, Node tree2){
        return isIdenticalRec(tree1, tree2);
    }

    private boolean isIdenticalRec(Node t1, Node t2){
        if (t1 == null || t2 == null){
            return t1 == t2;
        }
        return (t1.data == t2.data)
                && isIdenticalRec(t1.left, t2.left)
                && isIdenticalRec(t1.right, t2.right);
    }

    private Node insertRec(Node root, int val){
        if (root == null) return new Node(val);

        if (val < root.data) root.left = insertRec(root.left, val);
        else if (val > root.data) root.right = insertRec(root.right, val);

        return root;
    }

    public static void main(String[] args) {
        Node t1 = null, t2 = null;

        int[] arr1 = {7, 3, 8, 1, 2, 9, 0, 10};
        int[] arr2 = {7, 3, 8, 1, 2, 9, 0, 10, 30};

        checkTwoTreesAreSame obj1 = new checkTwoTreesAreSame();

        for(int ele : arr1){
            t1 = obj1.insert(t1, ele);
        }

        for(int ele : arr2){
            t2 = obj1.insert(t2, ele);
        }

        boolean result = obj1.isIdentical(t1, t2);

        if(result) System.out.println("Trees are identical");
        else System.out.println("Trees are NOT identical");
    }
}
