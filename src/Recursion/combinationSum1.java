package Recursion;

import java.util.ArrayList;
import java.util.List;

public class combinationSum1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = {2,3,6,7};
        int tar = 7;

        List<List<Integer>> res = findCombinationSum1(0, arr, tar, list);
        System.out.println(res);
    }

    public static List<List<Integer>> findCombinationSum1(int i, int[] arr, int tar, List<Integer> list){
        List<List<Integer>> ans = new ArrayList<>();

        if (i == arr.length) {
            if (tar == 0) {
                ans.add(new ArrayList<>(list));
            }
            return ans;
        }

        if (arr[i] <= tar) {
            list.add(arr[i]);
            ans.addAll(findCombinationSum1(i, arr, tar - arr[i], list));
            list.removeLast();
        }
        ans.addAll(findCombinationSum1(i+1, arr, tar, list));
        return ans;
    }
}
