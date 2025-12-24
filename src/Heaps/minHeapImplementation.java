package Heaps;

import java.util.ArrayList;

class minHeap {
    ArrayList<Integer> heap;

    minHeap() {
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
            if (heap.get(parent) > heap.get(idx)){
                int temp = heap.get(parent);
                heap.set(parent, heap.get(idx));
                heap.set(idx, temp);

                idx = parent;
            } else {
                break;
            }
        }
    }

    public int returnMin(){
        if (heap.isEmpty()){
            System.out.println("Heap is empty");
            return -1;
        }
        int min = heap.getFirst();
        heap.set(0, heap.getLast());
        heap.removeLast();

        heapifyDown(0);
        return min;
    }

    public void heapifyDown(int index){
        int shortest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heap.size() && heap.get(left) < heap.get(shortest)) shortest = left;
        if (right < heap.size() && heap.get(right) < heap.get(shortest)) shortest = right;

        if (shortest != index){
            int temp = heap.get(shortest);
            heap.set(shortest, heap.get(index));
            heap.set(index, temp);

            heapifyDown(shortest);
        }
    }
}

public class minHeapImplementation {
    public static void main(String[] args) {
        minHeap mih = new minHeap();
        mih.insert(90);
        mih.insert(75);
        mih.insert(62);
        mih.insert(100);

        mih.display();
        System.out.println("peek: "+mih.peek());
        System.out.println("min: "+mih.returnMin());
        mih.display();
    }
}