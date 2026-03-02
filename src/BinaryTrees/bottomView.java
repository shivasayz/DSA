package BinaryTrees;

import java.util.*;

class TreeNode5 {
    int data;
    TreeNode5 left;
    TreeNode5 right;

    TreeNode5(int val){
        this.data = val;
        left = right = null;
    }
}

class BottomViewQPair {
    TreeNode5 node;
    int col;

    BottomViewQPair(TreeNode5 node, int col){
        this.node = node;
        this.col = col;
    }
}

public class bottomView {
    public TreeNode5 insert(TreeNode5 root, int val){
        if (root == null){
            root = new TreeNode5(val);
            return root;
        }

        if (val < root.data) root.left = insert(root.left, val);
        if (val > root.data) root.right = insert(root.right, val);

        return root;
    }

    public List<Integer> printBottomView(TreeNode5 root){
        List<Integer> result = new ArrayList<>();
        int minCol = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;

        if (root == null) return result;
        Map<Integer, Integer> map = new HashMap<>();
        Queue<BottomViewQPair> q = new LinkedList<>();
        q.offer(new BottomViewQPair(root, 0));

        while (!q.isEmpty()){
            BottomViewQPair curr = q.poll();
            TreeNode5 node = curr.node;
            int col = curr.col;

            map.put(col, node.data);
            minCol = Math.min(minCol, col);
            maxCol = Math.max(maxCol, col);

            if (node.left != null)
                q.offer(new BottomViewQPair(node.left, col - 1));

            if (node.right != null)
                q.offer(new BottomViewQPair(node.right, col + 1));
        }

        for(int i = minCol; i<= maxCol; i++){
            result.add(map.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        bottomView obj = new bottomView();
        int[] values = {20, 18, 30, 15, 19, 24, 32};
        TreeNode5 root = null;
        for(int num: values){
            root = obj.insert(root, num);
        }
        List<Integer> res = obj.printBottomView(root);
        System.out.println(res);
    }
}
