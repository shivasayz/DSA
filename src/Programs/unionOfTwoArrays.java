package Programs;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class unionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        union(arr1, arr2);
    }

    public static void union(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();

        for (int j : nums1) {
            set.add(j);
        }

        for(int i: nums2){
            set.add(i);
        }

        Integer[] res = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(res));
    }
}
