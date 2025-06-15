package Programs;

import java.util.Arrays;

public class ApplyOperationsToArray_2460 {
    public static void main(String[] args) {
//        int[] arr = {1,2,2,1,1,0};
        int[] arr = {0, 1};
        System.out.println(Arrays.toString(arr));
        int[] res = applyOperations(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] applyOperations(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                byTwo(nums, i, i + 1);
            }
        }
        moveZeroToCorner(nums);
        return nums;
    }

    public static void byTwo(int[] arr, int x, int y){
        arr[x] = arr[x] * 2;
        arr[y] = 0;
    }

    public static void  moveZeroToCorner(int[] arr){
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }
}
