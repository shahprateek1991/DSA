package org.dsa.math;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    @Test
    void shouldReturnLeadersForAGivenArray() {
        assertEquals(List.of(2,5,6,10), Array.leaders(new int[]{7,10,4,10,6,5,2}));
        assertEquals(List.of(30), Array.leaders(new int[]{10,20,30}));
        assertEquals(List.of(10,20,30), Array.leaders(new int[]{30,20,10}));
    }

    @Test
    void shouldReturnMaximumDifferenceOfArrayInOrder() {
        assertEquals(8, Array.maximumDifference(new int[] {2,3,10,6,4,8,1}));
        assertEquals(2, Array.maximumDifference(new int[] {7,9,5,6,3,2}));
        assertEquals(20, Array.maximumDifference(new int[] {10,20,30}));
        assertEquals(-2, Array.maximumDifference(new int[] {30,10,8,2}));
    }

    @Test
    void shouldPrintFrequencyOfNumbersInSortedArray() {
        Array.frequencyInSortedArray(new int[]{10,20,20,30,30,30,30});
        Array.frequencyInSortedArray(new int[]{10,10,10,30,40});
        Array.frequencyInSortedArray(new int[]{10,20,30,40,50});
    }

    @Test
    void shouldCountNumberOfMaximumConsecutiveOnes() {
        assertEquals(2, Array.maxConsecutiveOnes(new int[] {0,1,1,0,1}));
        assertEquals(4, Array.maxConsecutiveOnes(new int[] {0,1,1,1,1}));
        assertEquals(0, Array.maxConsecutiveOnes(new int[] {0,0,0,0}));
        assertEquals(4, Array.maxConsecutiveOnes(new int[] {1,1,1,1}));
        assertEquals(1, Array.maxConsecutiveOnes(new int[] {1,0,1}));
        assertEquals(3, Array.maxConsecutiveOnes(new int[] {1,0,1,0,1,1,1}));
    }

    @Test
    void shouldReturnMaximumSumOfSubArray() {
        assertEquals(4, Array.maximumSubArraySum(new int[]{-5,1,-2,3,-1,2,-2}));
        assertEquals(11, Array.maximumSubArraySum(new int[]{2,3,-8,7,-1,2,3}));
        assertEquals(16, Array.maximumSubArraySum(new int[]{5,8,3}));
        assertEquals(-3, Array.maximumSubArraySum(new int[]{-5,-8,-3}));
    }
}