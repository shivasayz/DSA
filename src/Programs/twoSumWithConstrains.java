package Programs;

import java.util.*;

public class twoSumWithConstrains {
    public static void main(String[] args){
        int[] arr = {1, 3, 2, 4};
        int tar = 5;

        System.out.println(twoSumWithConstraints(arr, tar));
    }

    public static List<List<Integer>> twoSumWithConstraints(int[] arr, int tar){
        Map<Integer, Integer> ele  = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            int complement = tar - arr[i];
            if (ele.containsKey(complement)){
                int idx = ele.get(complement);

                if (Math.abs(idx - i) <= 2){
                    res.add(Arrays.asList(arr[i], arr[idx]));
                }
            }
            ele.put(arr[i], i);
        }
        return res;
    }


}
