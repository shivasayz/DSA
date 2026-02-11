package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllTraversal {
    public static class TreeNode2 {
        int data;
        TreeNode2 left;
        TreeNode2 right;

        public TreeNode2(int data){
            this.data = data;
            left = right = null;
        }
    }

    static class Pair {
        TreeNode2 node;
        int state;

        public Pair(TreeNode2 root, int state) {
            this.node = root;
            this.state = state;
        }
    }

    public TreeNode2 insert(TreeNode2 root, int val){
        if (root == null){
            root = new TreeNode2(val);
            return root;
        }

        if (val < root.data) root.left = insert(root.left, val);
        else if (val > root.data) root.right = insert(root.right, val);

        return root;
    }

    public void traversal(TreeNode2 root){
        List<Integer> in = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        Stack<Pair> st = new Stack<>();

        if (root == null) return;
        st.push(new Pair(root, 1));

        while (!st.isEmpty()){
            Pair top = st.pop();

            // pre
            if (top.state == 1){
                pre.add(top.node.data);
                top.state++;
                st.push(top);

                if (top.node.left != null) st.push(new Pair(top.node.left, 1));
            }

            // in
            else if (top.state == 2){
                in.add(top.node.data);
                top.state++;
                st.push(top);

                if (top.node.right != null){
                    st.push(new Pair(top.node.right, 1));
                }
            }

            // post
            else {
                post.add(top.node.data);
            }
        }
        System.out.println("InOrder: "+in);
        System.out.println("PreOrder: "+pre);
        System.out.println("PostOrder: "+post);
    }

    public static void main(String[] args) {
        AllTraversal obj = new AllTraversal();
        int[] value = {50, 42, 60, 40, 45, 65};

        TreeNode2 root = null;
        for(int ele: value){
            root = obj.insert(root, ele);
        }

        obj.traversal(root);
    }
}
