package org.dsa.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void shouldReturnIndexOfSecondLargestElementInArray() {
        assertEquals(5, Array.findSecondLargestElementIndex(new int[] {1,4,6,8,3,7}));
        assertEquals(0, Array.findSecondLargestElementIndex(new int[] {10,5,8,20}));
        assertEquals(4, Array.findSecondLargestElementIndex(new int[] {20,10,20,8,12}));
        assertEquals(-1, Array.findSecondLargestElementIndex(new int[] {10,10,10,10}));
    }

    @Test
    void shouldCheckIfArrayIsSortedInAscendingOrder() {
        assertFalse(Array.isArraySortedInAscendingOrder(new int[]{1, 4, 6, 8, 3, 7}));
        assertFalse(Array.isArraySortedInAscendingOrder(new int[]{10, 5, 8, 20}));
        assertTrue(Array.isArraySortedInAscendingOrder(new int[]{10, 10, 10, 10}));
        assertTrue(Array.isArraySortedInAscendingOrder(new int[]{1, 10, 100, 100}));
    }

    @Test
    void shouldReverseGivenArray() {
        assertArrayEquals(new int[] {5,4,3,2,1}, Array.reverse(new int[] {1,2,3,4,5}));
        assertArrayEquals(new int[] {4,3,2,1}, Array.reverse(new int[] {1,2,3,4}));
    }
}