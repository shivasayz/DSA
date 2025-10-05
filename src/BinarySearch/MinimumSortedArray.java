package BinarySearch;

public class MinimumSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr){
        int ans = Integer.MAX_VALUE;
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            // optional optimization
            if (arr[start] <= arr[end]){
                ans = Math.min(ans, arr[start]);
                break;
            }

            if (arr[start] <= arr[mid]){
                ans = Math.min(ans, arr[start]);
                start = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }
}
