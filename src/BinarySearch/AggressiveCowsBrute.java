package BinarySearch;

import java.util.Arrays;

public class AggressiveCowsBrute {
    public static void main(String[] args) {
        int[] stalls = {0,3,4,7,10,9};
        int k = 4;

        System.out.println(findMaxPossibleMinDistance(stalls, k));
    }

    public static int findMaxPossibleMinDistance(int[] stalls, int cows){
        Arrays.sort(stalls);
        for (int i=0; i<stalls[stalls.length-1] - stalls[0]; i++){
            if (canWePlace(stalls, i, cows)) continue;
            else return i-1;
        }
        return -1;
    }

    public static boolean canWePlace(int[] arr, int dist, int cows){
        int c = 1, last = arr[0];

        for (int i=1; i<=arr.length-1; i++){
            if (arr[i] - last >= dist){
                c++;
                last = arr[i];
            }
        }
        return c >= cows;
    }
}
