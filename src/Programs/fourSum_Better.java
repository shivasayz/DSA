package Programs;

import java.util.*;

public class fourSum_Better {
    public static void main(String[] args) {
        int[] arr = {1, 2, -1, -2, 2, 0, -1};
        Set<List<Integer>> ans = findFourSum(arr, 0);
        System.out.println(ans);
    }

    public static Set<List<Integer>> findFourSum(int[] arr, int tar) {
        Set<List<Integer>> res = new HashSet<>();

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                List<Integer> list = new ArrayList<>();
                for (int k=j+1; k<arr.length; k++) {
                    int fourth = tar - (arr[i] + arr[j] + arr[k]);

                    if (list.contains(fourth)) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], fourth);
                        temp.sort(null);
                        res.add(temp);
                    }
                    list.add(arr[k]);
                }
            }
        }
        return res;
    }
}
