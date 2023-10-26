package org.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinHeap {
    List<Integer> heap;

    public MinHeap(int[] arr) {
        this.heap = new ArrayList<>(Arrays.stream(arr).boxed().toList());
    }

    public List<Integer> addData(Integer data) {
        this.heap.add(data);
        int index = this.heap.size()-1;
        while (index!=0 && heap.get(index) < heap.get(parent(index))) {
            swapIndex(index, parent(index));
            index = parent(index);
        }

        return List.copyOf(this.heap);
    }

    public List<Integer> decreaseKey(int index, int data) {
        this.heap.set(index, data);
        while (index!=0 && heap.get(index) < heap.get(parent(index))) {
            swapIndex(index, parent(index));
            index = parent(index);
        }

        return List.copyOf(this.heap);
    }

    public List<Integer> minHeapify(int index) {
        minHeapifyRec(index);
        return List.copyOf(this.heap);
    }

    private void minHeapifyRec(int index) {
        int smallest = index;
        int left = left(index);
        int right = right(index);

        if (left < heap.size() && heap.get(left) < heap.get(index)) {
            smallest = left;
        }
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        if (smallest != index) {
            swapIndex(index, smallest);
            minHeapifyRec(smallest);
        }
    }

    private void swapIndex(int a, int b) {
        Integer temp = heap.get(a);
        heap.set(a, heap.get(b));
        heap.set(b, temp);
    }

    private Integer left(int i) {
        return (2*i)+1;
    }

    private Integer right(int i) {
        return (2*i)+2;
    }

    private Integer parent(int i) {
        return (i-1)/2;
    }
}
