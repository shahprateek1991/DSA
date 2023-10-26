package org.dsa;

import java.util.PriorityQueue;

public class HeapAlgo {

    public int[] sortKSortedArray(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int index = 0;

        for (int i= 0; i<=k; i++) {
            queue.add(arr[i]);
        }

        for (int i = k+1; i < arr.length; i++) {
            arr[index] = queue.poll();
            index++;
            queue.add(arr[i]);
        }

        while( !queue.isEmpty()) {
            arr[index++] = queue.poll();
        }

        return arr;
    }
}
