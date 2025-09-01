package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2};
        int sum = 4;

        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        findCombinationSum2(0, arr, sum, ans, new ArrayList<>());
        System.out.println(ans);

    }

    public static void findCombinationSum2(int idx, int[] arr, int sum, List<List<Integer>> ans, List<Integer> list){

        if (sum == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx; i<arr.length; i++){
            if (i > idx && arr[i] == arr[i-1]) continue;
            if (arr[i] > sum) break;

            list.add(arr[i]);
            findCombinationSum2(i+1, arr, sum - arr[i], ans, list);
            list.removeLast();
        }
    }
}
