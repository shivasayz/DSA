package BinarySearch;

public class countNumberOfOccurrencesOptimal {
    public static void main(String[] args) {
        int[] arr = {2,8,8,8,8,8,11,13};
        int k = 8;
        System.out.println(countOccurrence(arr, k));
    }

    public static int countOccurrence(int[] arr, int k) {
        int lb = findFirstOccurrence(arr, k);
        if ((lb == arr.length) || arr[lb] != k){
            return -1;
        }

        int ub = findLastOccurrence(arr, k);
        return ub - lb;
    }

    public static int findFirstOccurrence(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= k){
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int findLastOccurrence(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > k){
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}

