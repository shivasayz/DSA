package Programs;

import java.util.*;

public class PartitionOnGivenPivot_2161 {
    public static int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int m = 0;

        for (int num : nums) {
            if (num < pivot) {
                res[m++] = num;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                res[m++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                res[m++] = num;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-3,4,3,2};
        int pivot = 2;
        System.out.println(Arrays.toString(pivotArray(nums, pivot)));
    }
}
