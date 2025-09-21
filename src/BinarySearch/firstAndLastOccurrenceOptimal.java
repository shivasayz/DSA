package BinarySearch;

import java.util.Arrays;

public class firstAndLastOccurrenceOptimal {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,11,13};
        int[] res = findOccurrence(arr, 8);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findOccurrence(int[] arr, int k){

        int f = findFirst(arr, k);
        // (f == arr.length) - if the first(f) idx points to n -> then k is not present
        // Or it returns any greater element (lower bound condition >=)
        // (arr[f] != k) - element points to different number then k
        if ((f == arr.length) || (arr[f] != k)){
            return new int[] {-1, -1};
        }
        return new int[] {f, findLast(arr, k)};
    }

    public static int findFirst(int[] arr, int k){
       int start = 0;
       int end = arr.length-1;
       int ans = arr.length;

       while (start <= end) {
           int mid = start + (end - start) / 2;
           if (arr[mid] >= k) {
               ans = mid;
               end = mid - 1;
           } else {
               start = mid + 1;
           }
       }
       return ans;
    }

    public static int findLast(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > k) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans -1;
    }
}

// TC -> 2 x O(log n)
// SC -> O(1)