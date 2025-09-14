package BinarySearch;

// floor - greatest element in the array that is less than or equal to x
public class floorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,4,7,8,10};
        System.out.println(findFloor(arr, 9));
    }

    public static int findFloor(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= k) {
                ans = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return ans;
    }
}
