package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackAlgoTest {

    @Test
    void shouldReturnPreviousGreaterElementInTheArray() {
        assertArrayEquals(new int[]{-1,15,-1,18,12,12,6,12},
                StackAlgo.previousGreaterElement(new int[] {15,10,18,12,4,6,2,8}));
        assertArrayEquals(new int[]{-1,-1,-1},
                StackAlgo.previousGreaterElement(new int[] {8,10,12}));
        assertArrayEquals(new int[]{-1,12,10},
                StackAlgo.previousGreaterElement(new int[] {12,10,8}));
    }

    @Test
    void shouldReturnNextGreaterElementInTheArray() {
        assertArrayEquals(new int[]{15,18,12,12,12,18,18,-1},
                StackAlgo.nextGreaterElement(new int[] {5,15,10,8,6,12,9,18}));
        assertArrayEquals(new int[]{15,20,25,-1},
                StackAlgo.nextGreaterElement(new int[] {10,15,20,25}));
        assertArrayEquals(new int[]{-1,-1,-1,-1},
                StackAlgo.nextGreaterElement(new int[] {25,20,15,10}));
    }
}