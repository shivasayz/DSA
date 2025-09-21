package BinarySearch;

import java.util.Arrays;

public class firstAndLastOccurrenceBrute {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,11,13};
        int[] res = findOccurrence(arr, 8);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findOccurrence(int[] arr, int x){
        int first = -1;
        int last = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        return new int[] {first,last};
    }
}
