package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class fourSum_Optimal {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        Set<List<Integer>> ans = findFourSum(arr, 0);
        System.out.println(ans);
    }

    public static Set<List<Integer>> findFourSum(int[] arr, int tar){
        Arrays.sort(arr);
        Set<List<Integer>> res = new HashSet<>();

        for(int i=0; i<arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (j > i+1 && arr[j] == arr[j - 1]) continue;

                int k = j + 1;
                int l = arr.length - 1;

                while (k < l) {
                    int sum = arr[i] + arr[j];
                    sum += arr[k] + arr[l];

                    if (sum == tar) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        temp.sort(null);
                        res.add(temp);
                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k - 1]) k++;
                        while (k < l && arr[l] == arr[l + 1]) l--;
                    } else if (sum > tar) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return res;
    }

}
