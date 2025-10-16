package BinarySearch;

public class KthMissingNumberBrute1 {
    public static void main(String[] args) {
        int[] arr = {4,7,9,10};
        int k = 3;

        System.out.println(findKthNumber(arr, k));
    }

    public static int findKthNumber(int[] arr, int k) {
        int val = k;

        for(int ele: arr) {
            if (ele <= val) val++;
        }
        return val;
    }
}
