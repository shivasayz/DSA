package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subSequence {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = {3, 1, 2};

        findSubsequence(0, arr, list);
    }

    public static void findSubsequence(int idx, int[] arr, List<Integer> list) {
        int n = arr.length-1;

        if (idx > n) {
            System.out.println(list);
            return;
        }

        list.add(arr[idx]);
        findSubsequence(idx+1, arr, list);
        list.removeLast();
        findSubsequence(idx+1, arr, list);
    }
}
