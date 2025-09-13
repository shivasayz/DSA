package Recursion;

import java.util.ArrayList;
import java.util.List;

public class allPermutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = findPermutations(arr);
        for(List<Integer> per: ans){
            System.out.println(per);
        }
    }

    public static List<List<Integer>> findPermutations(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];
        recursivePermutations(arr, list, ans, freq);
        return ans;
    }

    public static void recursivePermutations(int[] arr, List<Integer> list, List<List<Integer>> ans, boolean[] freq) {

        if (list.size() == arr.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i=0; i<arr.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                list.add(arr[i]);
                recursivePermutations(arr, list, ans, freq);
                list.removeLast();
                freq[i] = false;
            }
        }
    }
}
