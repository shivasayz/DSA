package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class rightView {
    Node root;

    public Node insert(int val){
        return root = insertRec(root, val);
    }

    public List<Integer> printRightView (Node root){
        List<Integer> res = new ArrayList<>();
        printRightViewRec(root, res, 0);
        return res;
    }

    public void printRightViewRec(Node root, List<Integer> res, int level) {
        if (root == null) return;

        if (level == res.size()) res.add(root.data);
        // right view -> reverse is left view
        printRightViewRec(root.right, res, level+1);
        printRightViewRec(root.left, res, level+1);
    }

    private Node insertRec(Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        }

        if (val < root.data) root.left = insertRec(root.left, val);
        if (val > root.data) root.right = insertRec(root.right, val);

        return root;
    }

    public static void main(String[] args) {
        rightView obj = new rightView();
        int[] values = {20, 18, 30, 15, 19, 24, 32, 21};
        Node root = null;
        for(int ele: values){
            root = obj.insert(ele);
        }
        System.out.println(obj.printRightView(root));
    }
}
