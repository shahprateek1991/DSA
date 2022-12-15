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

    @Test
    void shouldRemoveDuplicateFromSortedArray() {
        assertArrayEquals(new int[] {10,20,30}, Array.removeDuplicateFromSortedArray(new int[]{10,20,20,30,30,30,30}));
        assertArrayEquals(new int[] {10}, Array.removeDuplicateFromSortedArray(new int[]{10,10,10}));

    }

    @Test
    void shouldRMoveAllZeroToEndInTheGiveArray() {
        assertArrayEquals(new int[] {1,3,5,0,0}, Array.moveAllZerosToEnd(new int[] {1,0,3,0,5}));
        assertArrayEquals(new int[] {3,4,0,0}, Array.moveAllZerosToEnd(new int[] {0,0,3,4}));
        assertArrayEquals(new int[] {10,0,0,0,0}, Array.moveAllZerosToEnd(new int[] {0,0,0,10,0}));
        assertArrayEquals(new int[] {10,20}, Array.moveAllZerosToEnd(new int[] {10,20}));
        assertArrayEquals(new int[] {8,5,10,20,0,0}, Array.moveAllZerosToEnd(new int[] {8,5,0,10,0,20}));
    }

    @Test
    void shouldRotateArrayByRotateFactor() {
        assertArrayEquals(new int[] {2,3,4,5,1}, Array.rotateLeftArray(new int[]{1,2,3,4,5}, 1));
        assertArrayEquals(new int[] {3,4,5,1,2}, Array.rotateLeftArray(new int[]{1,2,3,4,5}, 2));
        assertArrayEquals(new int[] {15,10,5,30}, Array.rotateLeftArray(new int[]{10,5,30,15}, 3));
    }

    @Test
    void shouldRotateArrayByRotateFactor_withoutUsingExtraSpace() {
        assertArrayEquals(new int[] {2,3,4,5,1}, Array.rotateLeftArrayWithoutExtraSpace(new int[]{1,2,3,4,5}, 1));
        assertArrayEquals(new int[] {3,4,5,1,2}, Array.rotateLeftArrayWithoutExtraSpace(new int[]{1,2,3,4,5}, 2));
        assertArrayEquals(new int[] {15,10,5,30}, Array.rotateLeftArrayWithoutExtraSpace(new int[]{10,5,30,15}, 3));
    }
}