package BinarySearch;

// ceil - smallest element in an array, greater than or equal to K
public class CeilOfNumber {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        System.out.println(findCeil(arr, 11));  // Output: -1
    }

    public static int findCeil(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= k) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}

