package BinaryTrees;

import java.util.*;

public class ZigZagOrSpiralTraversal {
    Node root;

    ZigZagOrSpiralTraversal(){
        root = null;
    }

    public void insert(int val){
        root = insertRec(root, val);
    }

    public void zigzagTraversal(){
        List<Integer> res = zigzagTraversalRec(root);
        System.out.println(res);
    }

    private List<Integer> zigzagTraversalRec(Node root){
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        boolean leftToRight = true;
        
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            
            for (int i=0; i<size; i++){
                Node curr = q.poll();
                if (curr != null) level.add(curr.data);
                
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            if (!leftToRight) Collections.reverse(level);
            ans.addAll(level);
            leftToRight = !leftToRight;
        }
        return ans;
    }

    private Node insertRec(Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        }

        if (val < root.data) root.left = insertRec(root.left, val);
        else if (val > root.data) root.right = insertRec(root.right, val);

        return root;
    }
}
