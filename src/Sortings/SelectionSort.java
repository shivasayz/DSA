package Sortings;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};
        int len = arr.length;

        Print(arr);
        System.out.println();
        SelectionSortMeth(arr, len);
        Print(arr);
    }

    public static void SelectionSortMeth(int[] arr, int len){

        for (int i = 0; i < len-1; i++) {
            int mini = i;
            for (int j = i; j <= len-1 ; j++) {
                if (arr[mini] > arr[j])
                    mini = j;
            }
            Swap(arr, mini, i);
        }
    }

    public static void Swap(int[] arr, int mini, int i) {
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
    }

    public static void Print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
