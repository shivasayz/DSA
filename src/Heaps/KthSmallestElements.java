package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution4{
    public PriorityQueue<Integer> findKthSmallestElements(int[] arr, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele: arr){
            if (heap.size() < k) heap.add(ele);
            else if(!heap.isEmpty() && ele < heap.peek()){
                heap.poll();
                heap.add(ele);
            }
        }
        System.out.println(heap);
        return heap;
    }
}

public class KthSmallestElements {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 2, 1};
        int k = 2;

        Solution4 sol = new Solution4();
        System.out.println(sol.findKthSmallestElements(arr, k));
    }
}
