package Programs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class threeSum {
    public static void main(String[] args) {
        int[] arr = {-2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2};
        int tar = 0;

        Set<List<Integer>> res = findThreeSum(arr, tar);
        for(List<Integer> triples : res){
            System.out.println(triples);
        }
    }

    public static Set<List<Integer>> findThreeSum(int[] arr, int tar){
        Arrays.sort(arr);
        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i <arr.length-2 ; i++) {
            if (i>0 && arr[i] == arr[i-1]) continue;

            int j = i+1;
            int k = arr.length-1;

            while (j<k){
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == tar){
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;

                    while (j<k && arr[j] == arr[j-1]) j++;
                    while (j<k && arr[k] == arr[k+1]) k--;
                } else if (sum > tar){
                    k--;
                } else {
                    j++;
                }
            }
        }
        return res;
    }
}
