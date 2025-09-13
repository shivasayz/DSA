package Recursion;

import java.util.ArrayList;
import java.util.List;

public class allPermutationsOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> res = findPermutations(arr);
        for (List<Integer> per : res) {
            System.out.println(per);
        }
    }

    public static List<List<Integer>> findPermutations(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        recursivePermutations(0, arr, ans);
        return ans;
    }

    public static void recursivePermutations(int idx, int[] arr, List<List<Integer>> ans) {
        if (idx == arr.length) {
            List<Integer> perm = new ArrayList<>();
            for (int num : arr) perm.add(num);
            ans.add(perm);
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            recursivePermutations(idx + 1, arr, ans);
            swap(arr, idx, i); // backtrack
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
