package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode2 {
    int val;
    TreeNode2 left, right;

    TreeNode2(int val){
        this.val = val;
    }
}

public class AllTraversals {

    static class Pair {
        TreeNode2 node;
        int state;

        Pair(TreeNode2 node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static void TraversalAll(TreeNode2 root){
        if (root == null) return;

        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));

        while (!stack.isEmpty()){
            Pair top = stack.pop();

            // preprod
            if (top.state == 1){
                preorder.add(top.node.val);
                top.state++;
                stack.push(top);

                if (top.node.left != null){
                    stack.push(new Pair(top.node.left, 1));
                }
            }

            // inorder
            else if (top.state == 2) {
                inorder.add(top.node.val);
                top.state++;
                stack.push(top);

                if (top.node.right != null){
                    stack.push(new Pair(top.node.right, 1));
                }
            }

            // postorder
            else {
                postorder.add(top.node.val);
            }
        }

        System.out.println("PreOrder: "+preorder);
        System.out.println("InOrder: "+inorder);
        System.out.println("PostOrder: "+postorder);
    }

    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(1);
        root.left = new TreeNode2(2);
        root.right = new TreeNode2(3);
        root.left.left = new TreeNode2(4);
        root.left.right = new TreeNode2(5);
        root.right.right = new TreeNode2(6);

        TraversalAll(root);
    }
}
