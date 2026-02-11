package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postOrderTraversalIteration1Stack {
    Node root;

    public void insert(int key){
        root = insertRec(root, key);
    }

    public void postOrder(){
        List<Integer> res = postOrderRes(root);
        System.out.println(res);
    }

    private List<Integer> postOrderRes(Node root) {
        List<Integer> res = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        Node curr = root;
        Node lastVisited = null;

        while (curr != null || !st.isEmpty()) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                Node peekNode = st.peek();
                // if right child exists and traversal hasn't visited it yet
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    curr = peekNode.right;
                } else {
                    res.add(peekNode.data);
                    lastVisited = st.pop();
                }
            }
        }
        return res;
    }

    private Node insertRec(Node root, int key){
        if (root == null){
            root = new Node(key);
            return root;
        }

        if (key < root.data) root.left = insertRec(root.left, key);
        else if (key > root.data) root.right = insertRec(root.right, key);

        return root;
    }

    public static void main(String[] args) {

    }
}
