package Programs;

import java.util.Map;
import java.util.HashMap;

public class TwoSumCountPairs {
    public static void main(String[] args){
        int[] arr = {1, 5, 7, -1, 5};
        int tar = 6;
            System.out.println(countAllPairs(arr, tar));
        }

    public static int countAllPairs(int[] arr, int tar){
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for(int ele: arr){
            int complement = tar - ele;

            if (freq.containsKey(complement)){
                count += freq.get(complement);
            }
            freq.put(ele, freq.getOrDefault(ele, 0) + 1);
        }
        return count;
    }
}
