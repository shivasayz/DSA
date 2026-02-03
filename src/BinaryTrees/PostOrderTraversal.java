package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
    Node root;

    PostOrderTraversal(){
        root = null;
    }

    public List<Integer> PostOrderIteration(){
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        List<Integer> po = new ArrayList<>();

        if (root == null) return po;
        st1.push(root);

        while (!st1.isEmpty()){
            root = st1.pop();
            st2.add(root);

            if (root.left != null) st1.push(root.left);
            if (root.right != null) st1.push(root.right);
        }

        while (!st2.isEmpty()){
            po.add(st2.pop().data);
        }
        return po;
    }

    public void insert(int key){
        root = insertRec(root, key);
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
        PostOrderTraversal pt = new PostOrderTraversal();
        pt.insert(30);
        pt.insert(25);
        pt.insert(45);
        pt.insert(15);
        pt.insert(29);
        pt.insert(42);

        List<Integer> res = pt.PostOrderIteration();
        System.out.println(res);
    }
}
