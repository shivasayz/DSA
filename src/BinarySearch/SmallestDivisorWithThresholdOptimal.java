package BinarySearch;

public class SmallestDivisorWithThresholdOptimal {
    public static void main(String[] args) {
        int[] arr = {8,4,2,3};
        int limit = 10;

        System.out.println(smallestDivisor(arr, limit));
    }

    public static int smallestDivisor(int[] arr, int limit){
        if (arr.length < 2) return -1;

        int start = 1;
        int end = maxIn(arr);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isSmallest(arr, mid) <= limit){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int isSmallest(int[] arr, int val) {
        int res = 1;

        for(int ele: arr){
            res += (int) Math.ceil((double) ele / val);
        }
        return res;
    }

    public static int maxIn(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int ele: arr){
            if (ele > max) max = ele;
        }
        return max;
    }
}
