package BinarySearch;

public class binarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16};
        int x = 12;

        int res = findBinarySearch(arr, 0, arr.length-1, x);

        if (res != -1) {
            System.out.println(x+" found at index "+res);
        } else {
            System.out.println(x+" element not found");
        }
    }

    public static int findBinarySearch(int[] arr, int start, int end, int k){
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == k){
            return mid;
        }

        if (k < arr[mid]){
            return findBinarySearch(arr, start, mid - 1, k);
        }
        return findBinarySearch(arr, mid + 1, end, k);
    }
}
