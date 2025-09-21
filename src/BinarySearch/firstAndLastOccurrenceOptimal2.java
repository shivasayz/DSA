package BinarySearch;

import java.util.Arrays;

// Raw binary search approach
public class firstAndLastOccurrenceOptimal2 {
    public static void main(String[] args) {
        int[] arr = {2,8,8,8,8,8,11,13};
        int k = 8;

        int[] res = findOccurrence(arr, k);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findOccurrence(int[] arr, int k) {

        int n1 = firstOccurrence(arr, k);
        int n2 = lastOccurrence(arr, k);

        return new int[] {n1, n2};
    }

    public static int firstOccurrence(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k){
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] > k){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k){
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] > k){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

}
