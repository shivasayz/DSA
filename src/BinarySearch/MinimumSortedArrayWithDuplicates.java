package BinarySearch;

public class MinimumSortedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,4,4,5,5,5,1,2,3};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr){
        int ans = Integer.MAX_VALUE;
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[start] == arr[mid] && arr[mid] == arr[end]){
                start = start + 1;
                end = end - 1;
                continue;
            }

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
