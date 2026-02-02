package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversalIteration {
    Node root;

    InorderTraversalIteration() {
        root = null;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    public List<Integer> InOrderIteration(){
        List<Integer> inorder = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;

        while (curr != null || !st.isEmpty()){
            while (curr != null){
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            inorder.add(curr.data);

            curr = curr.right;
        }
        return inorder;
    }

    private Node insertRec(Node root, int key){
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) root.left = insertRec(root.left, key);
        else if (key > root.data) root.right = insertRec(root.right, key);

        return root;
    }

    public static void main(String[] args) {
        InorderTraversalIteration pt = new InorderTraversalIteration();
        pt.insert(30);
        pt.insert(25);
        pt.insert(45);
        pt.insert(15);
        pt.insert(29);
        pt.insert(42);

        List<Integer> res = pt.InOrderIteration();
        System.out.println(res);
    }
}
