package Heaps;

class Heap {
    public int getParent(int value){
        if (value <= 0) return 0;
        return (value-1)/2;
    }

    public boolean isMinHeap(int[] arr){
        for(int i=1; i<arr.length; i++){
            if (arr[getParent(i)] > arr[i]) return false;
        }
        return true;
    }
}

public class CheckArrayRepresentsAMinHeap {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 8, 6, 11};
        Heap mh = new Heap();
        System.out.println(mh.isMinHeap(arr));
    }
}
