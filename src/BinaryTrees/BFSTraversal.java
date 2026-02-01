package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    Node root;

    public BFSTraversal(){
        root = null;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    public void BFS(){
        bfs(root);
    }

    private void bfs(Node root){
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data+" ");

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }

    private Node insertRec(Node root, int key){
        if (root == null){
            root = new Node(key);
            return root;
        }

        if (root.data < key) root.left = insertRec(root.left, key);
        else if (root.data > key) root.right = insertRec(root.right, key);

        return root;
    }

    public static void main(String[] args) {
        BFSTraversal bfs = new BFSTraversal();
        bfs.insert(1);
        bfs.insert(2);
        bfs.insert(3);
        bfs.insert(4);
        bfs.insert(5);
        bfs.insert(6);
        bfs.insert(7);
        bfs.BFS();
    }
}
