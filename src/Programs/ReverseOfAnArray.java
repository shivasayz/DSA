package Programs;

import java.util.Arrays;

public class ReverseOfAnArray {
    public static void main(String[] args) {
        int[] arr = {4,5,2};
        int len = arr.length;

        int[] res = reverseOfNumber(arr, len);
        System.out.println(Arrays.toString(res));
    }

    private static int[] reverseOfNumber(int[] arr, int len) {
        int i = 0;
        int j = len - 1;

        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return arr;
    }
}
