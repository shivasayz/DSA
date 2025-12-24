package Heaps;

import java.util.ArrayList;

class maxHeap {
    ArrayList<Integer> heap;

    maxHeap(){
        heap = new ArrayList<>();
    }

    public void display(){
        System.out.println(heap);
    }

    public int peek(){
        if (!heap.isEmpty()) return heap.getFirst();
        return -1;
    }

    public void insert(int value){
        heap.add(value);
        int idx = heap.size()-1;

        while (idx > 0){
            int parent = (idx-1)/2;
            if (heap.get(parent) < heap.get(idx)){
                int temp = heap.get(parent);
                heap.set(parent, heap.get(idx));
                heap.set(idx, temp);

                idx = parent;
            } else {
                break;
            }
        }
    }

    public int returnMax(){
        if (heap.isEmpty()){
            System.out.println("Heap is empty");
            return -1;
        }

        int max = heap.getFirst();
        heap.set(0, heap.getLast());
        heap.removeLast();

        heapifyDown(0);
        return max;
    }

    public void heapifyDown(int index){
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heap.size() && heap.get(left) > heap.get(largest)) largest = left;
        if (right < heap.size() && heap.get(right) > heap.get(largest)) largest = right;

        if (largest != index){
            int temp = heap.get(largest);
            heap.set(largest, heap.get(index));
            heap.set(index, temp);

            heapifyDown(largest);
        }
    }
}

public class maxHeapImplementation {
    public static void main(String[] args) {
        maxHeap mh = new maxHeap();
        mh.insert(12);
        mh.insert(25);
        mh.insert(30);
        mh.insert(90);
        mh.insert(40);
        mh.display();
        System.out.println("max element: "+mh.returnMax());
        mh.display();
        System.out.println("peek element: "+mh.peek());
    }
}
