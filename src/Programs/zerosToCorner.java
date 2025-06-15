package Programs;

import java.util.Arrays;

public class zerosToCorner {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,3,4,5};
        zerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void zerosToEnd(int[] nums){
        int n = nums.length;
        int j = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0){
                j = i;
                break;
            }
        }

        for (int i = j+1; i <n ; i++) {
            if (nums[i] != 0){
                swap(nums, i, j);
                j++;
            }
        }
    }

    public static void swap(int[] arr, int n1, int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
