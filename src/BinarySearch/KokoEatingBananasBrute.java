package BinarySearch;

public class KokoEatingBananasBrute {
    public static void main(String[] args) {
        int[] piles = {7, 15, 6, 3};
        int h = 8;

        System.out.println(findMinHour(piles, h));
    }

    public static int findMinHour(int[] arr, int h) {
        int max = getMax(arr);

        for (int i=1; i<=max; i++) {
            int reqTime = findReqTime(arr, i);

            if (reqTime <= h) return i;
        }
        return -1;
    }

    public static int findReqTime(int[] arr, int spd) {
        int totalTime = 0;

        for (int ele: arr) {
//          totalTime += (ele + spd - 1) / spd;
            totalTime += (int) Math.ceil((double) ele / spd);
        }
        return totalTime;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];

        for(int ele: arr){
            if (ele > max) max = ele;
        }
        return max;
    }
}
