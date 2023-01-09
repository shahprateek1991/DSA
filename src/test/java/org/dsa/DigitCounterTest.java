package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitCounterTest {

    @Test
    void shouldReturnOneGivenZero() {
        assertEquals(1, DigitCounter.counter(0));
    }

    @Test
    void shouldReturnLengthGivenAnInteger() {
        assertEquals(3, DigitCounter.counter(123));
        assertEquals(2, DigitCounter.counter(10));
        assertEquals(1, DigitCounter.counter(9));
        assertEquals(5, DigitCounter.counter(85472));
    }
}