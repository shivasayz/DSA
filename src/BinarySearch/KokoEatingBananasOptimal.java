package BinarySearch;

public class KokoEatingBananasOptimal {
    public static void main(String[] args) {
        int[] piles = {7, 15, 6, 3};
        int h = 8;

        System.out.println(findMinHour(piles, h));
    }

    public static int findMinHour(int[] arr, int h) {
        int start = 1;
        int end = getMax(arr);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = findReqTime(arr, mid);

            if (res <= h){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
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
