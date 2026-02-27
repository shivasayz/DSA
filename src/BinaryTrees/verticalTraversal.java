package BinaryTrees;

import java.util.*;

class TreeNode3 {
    int data;
    TreeNode3 left;
    TreeNode3 right;

    TreeNode3(int data) {
        this.data = data;
        left = right = null;
    }
}

class Pair {
    TreeNode3 node;
    int col;

    Pair(TreeNode3 node, int col) {
        this.node = node;
        this.col = col;
    }
}

public class verticalTraversal {
    TreeNode3 root;

    verticalTraversal() {
        root = null;
    }

    public TreeNode3 insert(int val) {
        return root = insertRec(root, val);
    }

    public void verticalOrderTraversal(TreeNode3 root) {
        List<List<Integer>> res = printVerticalTraversal(root);
        System.out.println(res);
    }

    private List<List<Integer>> printVerticalTraversal(TreeNode3 root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            TreeNode3 node = current.node;
            int col = current.col;

            map.putIfAbsent(col, new ArrayList<>());
            map.get(col).add(node.data);

            if (node.left != null) queue.offer(new Pair(node.left, col - 1));
            if (node.right != null) queue.offer(new Pair(node.right, col + 1));
        }

        result.addAll(map.values());
        return result;
    }

    private TreeNode3 insertRec(TreeNode3 root, int val) {
        if (root == null) {
            root = new TreeNode3(val);
            return root;
        }

        if (val < root.data) root.left = insertRec(root.left, val);
        else if (val > root.data) root.right = insertRec(root.right, val);

        return root;
    }

    public static void main(String[] args) {
        verticalTraversal vt = new verticalTraversal();
        int[] values = {20, 18, 30, 19, 24, 32};

        TreeNode3 root = null;
        for (int val : values) {
            root = vt.insert(val);
        }
        vt.verticalOrderTraversal(root);
    }
}
