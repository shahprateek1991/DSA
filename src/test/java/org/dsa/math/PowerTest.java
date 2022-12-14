package org.dsa.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {

    @Test
    void shouldReturnExponentOfAGivenNumber() {
        assertEquals(9, Power.exponentIterative(3, 2));
        assertEquals(1, Power.exponentIterative(3, 0));
        assertEquals(16, Power.exponentIterative(2, 4));
        assertEquals(8, Power.exponentIterative(2, 3));
        assertEquals(343, Power.exponentIterative(7, 3));
    }

    @Test
    void shouldReturnExponentOfAGivenNumber_usingRecursive() {
        assertEquals(9, Power.exponentRecursive(3, 2));
        assertEquals(1, Power.exponentRecursive(3, 0));
        assertEquals(16, Power.exponentRecursive(2, 4));
        assertEquals(8, Power.exponentRecursive(2, 3));
        assertEquals(343, Power.exponentRecursive(7, 3));
    }

    @Test
    void name() {
        assertEquals(1, Power.myPow(2.00000, -2147483648));
    }
}