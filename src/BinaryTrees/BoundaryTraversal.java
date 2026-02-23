package BinaryTrees;

import java.util.ArrayList;
import java.util.Stack;

public class BoundaryTraversal {
    Node root;

    public Node insert(int val) {
        root = insertRec(root, val);
        return root;
    }

    private Node insertRec(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) root.left = insertRec(root.left, val);
        else if (val > root.data) root.right = insertRec(root.right, val);
        return root;
    }

    boolean isLeaf(Node root) {
        return root.left == null && root.right == null;
    }

    void addLeftBoundary(Node root, ArrayList<Integer> ans) {
        Node curr = root.left;
        while (curr != null) {
            if (!isLeaf(curr)) ans.add(curr.data);
            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    void addRightBoundary(Node root, ArrayList<Integer> ans) {
        Node curr = root.right;
        Stack<Integer> st = new Stack<>();
        while (curr != null) {
            if (!isLeaf(curr)) st.add(curr.data);
            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }

        for (int i = st.size() - 1; i >= 0; i--) {
            ans.add(st.get(i));
        }
    }

    void addLeaves(Node root, ArrayList<Integer> ans) {
        if (isLeaf(root)) {
            ans.add(root.data);
            return;
        }

        if (root.left != null) addLeaves(root.left, ans);
        if (root.right != null) addLeaves(root.right, ans);
    }

    ArrayList<Integer> printBoundary(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (node == null) return ans;
        if (!isLeaf(node)) ans.add(node.data);
        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }

    public static void main(String[] args) {
        BoundaryTraversal bt = new BoundaryTraversal();
        int[] vals = {20, 18, 30, 15, 19, 24, 32};
        Node root = null;
        for (int ele : vals) {
            root = bt.insert(ele);
        }

        ArrayList<Integer> res;
        res = bt.printBoundary(root);
        System.out.println(res);
    }
}
