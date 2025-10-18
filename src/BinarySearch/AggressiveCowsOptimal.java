package BinarySearch;

import java.util.Arrays;

public class AggressiveCowsOptimal {
    public static void main(String[] args) {
        int[] stalls = {0,3,4,7,10,9};
        int k = 4;

        System.out.println(findMaxPossibleMinDistance(stalls, k));
    }

    public static int findMaxPossibleMinDistance(int[] stalls, int cows){
        Arrays.sort(stalls);
        int start = 0;
        int end = stalls[stalls.length-1] - stalls[0];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((canWePlace(stalls, mid, cows))){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    public static boolean canWePlace(int[] arr, int dist, int cows){
        int c = 1, last = arr[0];

        for (int i=1; i<arr.length; i++){
            if (arr[i] - last >= dist){
                c++;
                last = arr[i];
            }
        }
        return c >= cows;
    }
}
