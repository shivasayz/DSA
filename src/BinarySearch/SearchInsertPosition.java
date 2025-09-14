package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,9,10};
        int x = 3;
        System.out.println(findInsertPosition(arr, arr.length, x));
    }

    public static int findInsertPosition(int[] arr, int n, int k) {
        int ans = n;
        int low = 0, high = n-1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= k){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
