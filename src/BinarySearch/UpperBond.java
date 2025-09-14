package BinarySearch;

public class UpperBond {
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int k = 16;

        int res = (findUpperBond(arr, k));
        if (res != arr.length){
            System.out.println("upper bond of "+k+" is "+res);
        } else {
            System.out.println("upper bond not found...");
        }
    }

    public static int findUpperBond(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > k){
                ans = arr[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
