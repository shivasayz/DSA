package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversalIteration {
    Node root;

    PreOrderTraversalIteration() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    public List<Integer> PreOrderIteration() {
        List<Integer> preorder = new ArrayList<>();

        if (root == null) return preorder;
        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {
            Node curr = st.pop();
            preorder.add(curr.data);

            if (curr.right != null) st.push(curr.right);
            if (curr.left != null) st.push(curr.left);
        }
        return preorder;
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) root.left = insertRec(root.left, key);
        else if (key > root.data) root.right = insertRec(root.right, key);

        return root;
    }

    public static void main(String[] args) {
        PreOrderTraversalIteration pt = new PreOrderTraversalIteration();
        pt.insert(30);
        pt.insert(25);
        pt.insert(45);
        pt.insert(15);
        pt.insert(29);
        pt.insert(42);

        List<Integer> res = pt.PreOrderIteration();
        System.out.println(res);
    }
}
