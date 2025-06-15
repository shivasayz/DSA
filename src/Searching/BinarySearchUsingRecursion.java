package Searching;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int len = arr.length;
        int target = 3;

        int res = BinarySearch(arr, 0, len-1, target);
        System.out.println(target+" found at index "+res);
    }

    public static int BinarySearch(int[] arr, int start, int end, int tar){

        if (start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (tar == arr[mid]){
            return mid;
        }

        if (tar < arr[mid]){
            return BinarySearch(arr, start , mid - 1, tar);
        }
        return BinarySearch(arr, mid+1, end, tar);
    }
}
