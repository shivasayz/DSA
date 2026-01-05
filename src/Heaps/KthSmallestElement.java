package Heaps;

import java.util.PriorityQueue;

class Solution2 {
    public Integer findKthSmallest(int[] arr, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int ele: arr){
            if (heap.size() < k) heap.add(ele);
            else if (!heap.isEmpty() && ele < heap.peek()){
                heap.poll();
                heap.add(ele);
            }
        }
        return heap.peek();
    }
}

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 2, 1};
        int k = 3;

        Solution2 sol = new Solution2();
        System.out.println("Top "+k+" smallest element: "+sol.findKthSmallest(arr, k));
    }
}
