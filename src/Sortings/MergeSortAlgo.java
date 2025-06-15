package Sortings;

import java.util.ArrayList;

public class MergeSortAlgo {
    public static void main(String[] args) {
        int[] arr = {38,27,43,10};
        int low = 0;
        int high = arr.length - 1;

        Print(arr);
        System.out.println();
        MergeSort(arr, low, high);
        Print(arr);
    }

    public static void MergeSort(int[] arr, int low, int high){

        if (low == high) return;

        int mid = low + (high - low) /  2;

        MergeSort(arr, low, mid);
        MergeSort(arr, mid+1, high);
        Merge(arr, low, mid, high);
    }

    public static void Merge(int[] arr, int low, int mid, int high){

        ArrayList<Integer> list = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high){

            if (arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left <= mid){
            list.add(arr[left]);
            left++;
        }

        while (right <= high){
            list.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high ; i++) {
            arr[i] = list.get(i-low);
        }
    }

    public static void Print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
