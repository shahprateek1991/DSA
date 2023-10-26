package org.dsa;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

    @Test
    void shouldSortArrayUsingBubbleSort() {
        assertArrayEquals(new int[] {1,2,3,4,5}, Sorting.bubbleSort(new int[] {5,2,1,3,4}));
    }

    @Test
    void shouldSortArrayUsingSelectionSort() {
        assertArrayEquals(new int[] {1,2,3,4,5}, Sorting.selectionSort(new int[] {5,2,1,3,4}));
    }

    @Test
    void shouldSortArrayUsingInsertionSort() {
        assertArrayEquals(new int[] {1,2,3,4,5}, Sorting.insertionSort(new int[] {5,2,1,3,4}));
    }

    @Test
    void shouldMergeTwoSortedArrays() {
        assertArrayEquals(new int[] {5,6,6,10,15,15,20},
                Sorting.mergeTwoSortedArrays(new int[]{10, 15, 20}, new int[]{5,6,6,15}));
        assertArrayEquals(new int[] {1,1,2,3},
                Sorting.mergeTwoSortedArrays(new int[]{1,1,2}, new int[]{3}));
    }

    @Test
    @Disabled
    void shouldSortArrayUsingMergeSort() {
        assertArrayEquals(new int[] {1,2,3,4,5}, Sorting.mergeSort(new int[] {5,2,1,3,4}));
    }
}