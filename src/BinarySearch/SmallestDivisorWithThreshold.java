package BinarySearch;

public class SmallestDivisorWithThreshold {
    public static void main(String[] args) {
        int[] arr = {8,4,2,3};
        int limit = 10;

        System.out.println(smallestDivisor(arr, limit));
    }

    public static int smallestDivisor(int[] arr, int limit){
        if (arr.length < 2) return -1;

        for (int i=0; i<arr.length; i++){
            if (isSmallest(arr, i) == limit) return i;
        }
        return -1;
    }

    public static int isSmallest(int[] arr, int val) {
        int res = 1;

        for(int ele: arr){
            res += (int) Math.ceil((double) ele / val);
        }
        return res;
    }
}
