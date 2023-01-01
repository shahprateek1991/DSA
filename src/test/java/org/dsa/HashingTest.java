package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashingTest {

    @Test
    void shouldCheckIfAPairSumExistsGivenUnsortedArray() {
        assertFalse(Hashing.doesPairExist(new int[]{11, 5, 3}, 10));
        assertTrue(Hashing.doesPairExist(new int[]{11, 5, 3}, 8));
    }
}