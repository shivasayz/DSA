package Heaps;

import java.util.Arrays;

class MaxHeap {
    public void buildMaxHeap(int[] arr){
        for(int i=(arr.length-1)/2; i>=0; i--){
            heapify(arr, i);
        }
    }

    public void heapify(int[] arr, int index){
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        int size = arr.length;

        if (left < size && arr[left] > arr[largest]) largest = left;
        if (right < size && arr[right] > arr[largest]) largest = right;

        if (index != largest){
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest);
        }
    }
}

public class convertMinHeapToMaxHeap {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 8, 6, 11};
        MaxHeap mh = new MaxHeap();
        mh.buildMaxHeap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
