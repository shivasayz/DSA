package Heaps;

import java.util.PriorityQueue;

class Solution {
    public Integer findKthLargest(int[] arr, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int ele: arr){
            if (heap.size() < k) heap.add(ele);
            else if (!heap.isEmpty() && ele > heap.peek()){
                heap.poll();
                heap.add(ele);
            }
        }
        return heap.peek();
    }
}

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 5, 2, 1, 6, 4};
        int k = 1;

        Solution sol = new Solution();
        System.out.println("Top "+k+" element: "+sol.findKthLargest(arr, k));
    }
}
