package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class fourSum_Brute {
    public static void main(String[] args) {
        int[] arr = {1, 2, -1, -2, 2, 0, -1};
        Set<List<Integer>> ans = findFourSum(arr);
        System.out.println(ans);
    }

    public static Set<List<Integer>> findFourSum(int[] arr) {
        Set<List<Integer>> res = new HashSet<>();

        for (int i=0; i<arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    for (int l = k + 1; l < arr.length; l++) {
                        int sum = arr[i] + arr[j];
                        sum += arr[k] + arr[l];
                        if (sum == 0) {
                            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            temp.sort(null);
                            res.add(temp);
                        }
                    }
                }
            }
        }
        return res;
    }
}
