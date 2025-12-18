package Programs;

import java.util.Arrays;

public class twoSumClosestSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 10};
        int tar = 15;

        System.out.println(Arrays.toString(findClosestMin(arr, tar)));
    }

    public static int[] findClosestMin(int[] arr, int tar){
        Arrays.sort(arr);
        int i=0, j=arr.length-1;
        int[] res = new int[2];
        int minDiff = Integer.MAX_VALUE;

        while (i < j){
            int sum = arr[i] + arr[j];
            int diff = Math.abs(sum - tar);

            if (diff < minDiff){
                minDiff = diff;
                res[0] = arr[i];
                res[1] = arr[j];
            } else if (sum < tar){
                i++;
            } else if (sum > tar){
                j--;
            } else {
                break;
            }
        }
        return res;
    }
}
