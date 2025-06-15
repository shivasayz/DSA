package Sortings;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {23,1,10,5,2};
        int len = arr.length;

        Print(arr);
        System.out.println();
        InsertionSortMeth(arr, len);
        Print(arr);
    }

    public static void InsertionSortMeth(int[] arr, int len){
        for (int i = 1; i < len; i++) {
            int x = arr[i];
            int j = i-1;

            while(j>=0 && x < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }
    }

    public static void Print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
