package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int len = arr.length;
        int target = 3;

        Print(arr);
        int res = BinarySearchMeth(arr, len, target);
        System.out.println();
        System.out.println(target+" found at index "+res);
    }

    public static int BinarySearchMeth(int[] arr, int len, int tar){

        int start = 0, end = len-1;
        while(start <= end){

            int mid = start + (end - start)/2;

            if (tar > arr[mid]){
                start = mid + 1;
            } else if (arr[mid] == tar){
                return mid;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static void Print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
