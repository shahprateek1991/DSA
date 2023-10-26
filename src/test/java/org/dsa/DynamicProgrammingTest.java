package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicProgrammingTest {

    @Test
    void shouldReturnCoinChange() {
        assertEquals(4, DynamicProgramming.coinChange(new int[] {1,2,3}, 3, 4));
        assertEquals(5, DynamicProgramming.coinChange(new int[] {2,5,3,6}, 4, 10));
    }
}