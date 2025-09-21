package BinarySearch;

// for this problem brute is linear search -> TC O(n)

public class searchInRotatedArray1 {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        int k = 1;
        System.out.println("element found at idx: "+findElement(arr, k));
    }

    public static int findElement(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k)
                return mid;

            if (arr[start] <= arr[mid]){
                if (arr[start] <= k && k<= arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= k && k<= arr[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

// TC -> O(log n)
// SC -> O(1)