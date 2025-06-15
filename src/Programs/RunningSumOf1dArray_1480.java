package Programs;

import java.util.Arrays;

public class RunningSumOf1dArray_1480 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};

        int[] res = runningSum(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] runningSum(int[] arr){
        int[] res = new int[arr.length];

        res[0] = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            res[i] = res[i-1] + arr[i];
        }
        return res;
    }
}
