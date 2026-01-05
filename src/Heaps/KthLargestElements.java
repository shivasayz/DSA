package Heaps;

import java.util.PriorityQueue;

class Solution3 {
    public PriorityQueue<Integer> findLargestKElements(int[] arr, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int ele: arr){
            if (heap.size() < k) heap.add(ele);
            else if (!heap.isEmpty() && ele > heap.peek()){
                heap.poll();
                heap.add(ele);
            }
        }
        return heap;
    }
}

public class KthLargestElements {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 5, 2, 1, 6, 4};
        int k = 2;

        Solution3 sol = new Solution3();
        System.out.println(sol.findLargestKElements(arr, k));
    }
}
