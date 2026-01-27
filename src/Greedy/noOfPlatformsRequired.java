package Greedy;

import java.util.Arrays;

public class noOfPlatformsRequired {
    public static void main(String[] args) {
//        int[] arr = {900, 945, 955, 1100, 1500, 1800};
        int[] arr = {1020, 1200};
//        int[] dep = {920, 1130, 1150, 1200, 1900, 2000};
        int[] dep = {1050, 1230};

        System.out.println(findMinPlatformRequired(arr, dep));
    }

    public static int findMinPlatformRequired(int[] arr, int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);

        int result=0, noPlatform=0;
        int n = arr.length;
        int i=0, j=0;

        while (i<n && j<n){
            if (arr[i] <= dep[j]){
                noPlatform++;
                i++;
            } else {
                noPlatform--;
                j++;
            }
            result = Math.max(result, noPlatform);
        }
        return result;
    }
}
