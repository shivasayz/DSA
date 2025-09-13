package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int res = findNumber(arr, 12);
        if (res != -1)
            System.out.println("Element found at "+res);
        else
            System.out.println("Element not found");
    }

    public static int findNumber(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        int mid;

        while (start <= end){
            mid = (start + end) / 2;

            if (arr[mid] == k){
                return mid;
            } else if (arr[mid] > k){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
