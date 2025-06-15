package Programs;

import java.util.Arrays;

public class InsertingIntoArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8};
        int len = arr.length - 1;
        int idx = 5;
        int ele = 6;
        InsertAt(arr, len, idx, ele);
    }

    public static void InsertAt(int[] arr, int len, int idx, int ele){


        len++;
        for (int i=len-1; i>=idx; i--){
            arr[i] = arr[i-1];
        }
        arr[idx] = ele;

        System.out.println(Arrays.toString(arr));
    }
}
