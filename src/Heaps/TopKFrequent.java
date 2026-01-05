package Heaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class heapFreq {
    int[] findTopKFrequency(int[] arr, int k){
        Map<Integer, Integer> heapFreq = new HashMap<>();
        for(int ele: arr){
            heapFreq.put(ele, heapFreq.getOrDefault(ele, 0)+1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((el, e2) -> heapFreq.get(el) - heapFreq.get(e2));
        for(int ele: heapFreq.keySet()){
            heap.add(ele);
            if (heap.size() > k){
                heap.poll();
            }
        }

        int[] res = new int[k];
        int i=0;
        while (!heap.isEmpty()){
            res[i++] = heap.poll();
        }

        return res;
    }
}

public class TopKFrequent {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,3,3};
        int k = 2;

        heapFreq sol = new heapFreq();
        System.out.println(Arrays.toString(sol.findTopKFrequency(arr, k)));
    }
}
