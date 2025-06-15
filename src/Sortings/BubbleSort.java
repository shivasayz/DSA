package Sortings;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        int len = arr.length;

        Print(arr);
        System.out.println();
        BubbleSortMeth(arr, len);
        Print(arr);
    }

    public static void BubbleSortMeth(int[] arr, int len){
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void Print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
