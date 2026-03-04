package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class rootToNode {
    Node root;

    public Node insert(int val){
        return root = insertRec(root, val);
    }

    public void printRootToNode(Node root, int tar){
        List<Integer> list = new ArrayList<>();
        rootToNodeHelper(root, tar, list);
        System.out.println(list);
    }

    private boolean rootToNodeHelper(Node root, int tar, List<Integer> res){
        if (root == null){
            return false;
        }

        res.add(root.data);
        if (root.data == tar){
            return true;
        }

        if (rootToNodeHelper(root.left, tar, res) || rootToNodeHelper(root.right, tar, res))
            return true;

        res.removeLast();
        return false;
    }

    private Node insertRec(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) root.left = insertRec(root.left, val);
        if (val > root.data) root.right = insertRec(root.right, val);

        return root;
    }

    public static void main(String[] args) {
        rootToNode obj = new rootToNode();
        int[] values = {20, 18, 30, 15, 19, 24, 32, 21};
        Node root = null;
        for(int ele: values){
            root = obj.insert(ele);
        }
        obj.printRootToNode(root, 21);
    }
}
