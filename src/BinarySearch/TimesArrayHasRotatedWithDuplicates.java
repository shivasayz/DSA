package BinarySearch;

public class TimesArrayHasRotatedWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {6,6,6,7,7,7,8,1,2,2,2,3,4,5};
        System.out.println(findTimesArrayRotated(arr));
    }

    public static int findTimesArrayRotated(int[] arr) {
        int idx = -1;
        int ans = Integer.MAX_VALUE;
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[start] == arr[mid] && arr[mid] == arr[end]){
                start = start + 1;
                end = end - 1;
                continue;
            }

            if (arr[start] <= arr[mid]){
                if (arr[start] < ans){
                    idx = start;
                    ans = arr[start];
                }
            }

            if (arr[start] <= arr[mid]){
                if (arr[start] < ans){
                    idx = start;
                    ans = arr[start];
                }
                start = mid + 1;
            } else {
                if (arr[mid] < ans) {
                    idx = mid;
                    ans = arr[mid];
                }
                end = mid - 1;
            }
        }
        return idx;
    }
}
