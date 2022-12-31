package org.dsa.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitOperatorTest {

    @Test
    void shouldCheckIfKthBitIsSetInGivenNumber() {
        assertTrue(BitOperator.isKthBitSet(5,1));
        assertFalse(BitOperator.isKthBitSet(5,2));
        assertTrue(BitOperator.isKthBitSet(5,3));
    }

    @Test
    void shouldCountSetBitsInANumber() {
        assertEquals(2, BitOperator.countSetBits(5));
        assertEquals(3, BitOperator.countSetBits(7));
    }

    @Test
    void shouldCountSetBitsInANumber_usingBrianKerningamAlgo() {
        assertEquals(2, BitOperator.countSetBits_BrianKerningamAlgo(5));
        assertEquals(3, BitOperator.countSetBits_BrianKerningamAlgo(7));
    }

    @Test
    void shouldCountSetBitsInANumber_usingLookupTables() {
        assertEquals(2, BitOperator.countSetBits_UsingLookupTable(5));
        assertEquals(3, BitOperator.countSetBits_UsingLookupTable(7));
    }

    @Test
    void shouldCheckIfNumberIsPowerOfTwo() {
        assertFalse(BitOperator.isPowerOfTwo(5));
        assertTrue(BitOperator.isPowerOfTwo(8));
        assertFalse(BitOperator.isPowerOfTwo(6));
        assertFalse(BitOperator.isPowerOfTwo(10));
    }
}