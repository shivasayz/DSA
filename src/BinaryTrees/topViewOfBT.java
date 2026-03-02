package BinaryTrees;

import java.util.*;

class TreeNode4 {
    int data;
    TreeNode4 left;
    TreeNode4 right;

    TreeNode4(int val){
        this.data = val;
        left = right = null;
    }
}

class TopViewQPair {
    TreeNode4 node;
    int col;

    TopViewQPair(TreeNode4 node, int col){
        this.node = node;
        this.col = col;
    }
}

public class topViewOfBT {
    TreeNode4 root;

    topViewOfBT(){
        root = null;
    }

    public TreeNode4 insert(int val){
        return root = insertRec(root, val);
    }

    public void printTopView(){
        System.out.println(printTopViewRec(root));
    }

    // Better
//    private List<Integer> printTopViewRec(TreeNode4 root){
//        List<Integer> result = new ArrayList<>();
//
//        if (root == null) return result;
//
//        Map<Integer, Integer> map = new TreeMap<>();
//        Queue<TopViewQPair> queue = new LinkedList<>();
//        queue.offer(new TopViewQPair(root, 0));
//
//        while (!queue.isEmpty()){
//            TopViewQPair curr = queue.poll();
//            TreeNode4 node = curr.node;
//            int col = curr.col;
//
//            if (!map.containsKey(col)){
//                map.put(col, node.data);
//            }
//
//            if (node.left != null)
//                queue.offer(new TopViewQPair(node.left, col - 1));
//
//            if (node.right != null)
//                queue.offer(new TopViewQPair(node.right, col + 1));
//        }
//
//        result.addAll(map.values());
//        return result;
//    }

    // Optimal
    private List<Integer> printTopViewRec(TreeNode4 root){
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Map<Integer, Integer> map = new HashMap<>();
        Queue<TopViewQPair> queue = new LinkedList<>();

        int minCol = 0, maxCol = 0;

        queue.offer(new TopViewQPair(root, 0));

        while (!queue.isEmpty()){
            TopViewQPair curr = queue.poll();
            TreeNode4 node = curr.node;
            int col = curr.col;

            if (!map.containsKey(col)){
                map.put(col, node.data);
                minCol = Math.min(minCol, col);
                maxCol = Math.max(maxCol, col);
            }

            if (node.left != null)
                queue.offer(new TopViewQPair(node.left, col - 1));

            if (node.right != null)
                queue.offer(new TopViewQPair(node.right, col + 1));
        }

        for (int i = minCol; i <= maxCol; i++){
            result.add(map.get(i));
        }

        return result;
    }

    private TreeNode4 insertRec(TreeNode4 root, int val){
        if (root == null){
            root = new TreeNode4(val);
            return root;
        }

        if (val < root.data) root.left = insertRec(root.left, val);
        else if (val > root.data) root.right = insertRec(root.right, val);

        return root;
    }

    public static void main(String[] args) {
        topViewOfBT obj = new topViewOfBT();
        int[] values = {20, 18, 30, 15, 19, 24, 32};
        for(int num: values){
           obj.insert(num);
        }
        obj.printTopView();
    }
}
