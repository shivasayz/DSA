package Programs;

import java.util.*;

public class twoSumUnqPairsWithoutDuplicatesUnSorted {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int tar = 6;

        System.out.println(findUnqPairs(arr, tar));
    }

    public static Set<List<Integer>> findUnqPairs(int[] arr, int tar){
        Set<Integer> freq = new HashSet<>();
        Set<List<Integer>> res = new HashSet<>();

        for(int ele: arr){
            int complement = tar - ele;
            if (freq.contains(complement)){
                int n1 = Math.min(ele, complement);
                int n2 = Math.max(ele, complement);
                res.add(Arrays.asList(n1, n2));
            }
            freq.add(ele);
        }
        return res;
    }
}
