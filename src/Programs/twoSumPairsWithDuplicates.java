package Programs;

import java.util.*;

// Unique - “Unique” here refers to the result pairs, not the elements themselves.
// You can use the same element twice if it exists in the array (e.g., 3 + 3 = 6).
// But no duplicate pairs should appear in the output.

// *** APPROACH WORKS FOR SORTED ARRAYS ONLY ***
public class twoSumPairsWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3};
        int tar = 4;

        findPairs(arr, tar);
    }

    public static void findPairs(int[] arr, int tar){
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        int j = arr.length-1;

        while (i < j){
            int sum = arr[i] + arr[j];

            if (sum > tar) j--;
            else if (sum < tar) i++;
            else {
                res.add(Arrays.asList(arr[i], arr[j]));
                i++;
                j--;
            }
        }
        System.out.println(res);
    }
}
