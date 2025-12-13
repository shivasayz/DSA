package Programs;

import java.util.*;

public class twoSumAllPairWithDuplicatesUnSorted {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int tar = 6;

        System.out.println(findAllPairs(arr, tar));
    }

    public static List<List<Integer>> findAllPairs(int[] arr, int target){
        Map<Integer, Integer> freq = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();

        for(int ele: arr){
            int complement = target - ele;
            if (freq.containsKey(complement)){
                int count = freq.get(complement);
                for(int i=0; i<count; i++){
                    res.add(Arrays.asList(ele, complement));
                }
            }
            freq.put(ele, freq.getOrDefault(ele, 0) + 1);
        }
        return res;
    }
}
