package org.dsa;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class MinHeapTest {

    @Test
    void shouldInsertDataInTheMinHeap() {
        MinHeap minHeap = new MinHeap(new int[]{10,20,15,40,50,100,25,45});

        List<Integer> result = minHeap.addData(12);

        assertIterableEquals(List.of(10,12,15,20,50,100,25,45,40), result);
    }

    @Test
    void shouldPerformMinHeapify() {
        MinHeap minHeap = new MinHeap(new int[]{40,20,30,35,25,80,32,100,70,60});

        List<Integer> result = minHeap.minHeapify(0);

        assertIterableEquals(List.of(20,25,30,35,40,80,32,100,70,60), result);
    }

    @Test
    void shouldDecreaseKeyFromHeap() {
        MinHeap minHeap1 = new MinHeap(new int[]{10,20,40,80,100,70});
        MinHeap minHeap2 = new MinHeap(new int[]{20,80,200,90,100,250,500,120});

        List<Integer> result1 = minHeap1.decreaseKey(3,5);
        List<Integer> result2 = minHeap2.decreaseKey(3,10);

        assertIterableEquals(List.of(5,10,40,20,100,70), result1);
        assertIterableEquals(List.of(10,20,200,80,100,250,500,120), result2);
    }
}