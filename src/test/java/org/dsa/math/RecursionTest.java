package org.dsa.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    void shouldPrintNaturalNumbersInReversedOrder() {
        Recursion.printReversedNaturalNumbers(5);
    }

    @Test
    void shouldPrintNaturalNumbersInAscendingOrder() {
        Recursion.printNaturalNumbers(5);
    }

    @Test
    void shouldReturnFactorialOfTheGivenNumber() {
        assertEquals(120, Recursion.factorial(5));
        assertEquals(24, Recursion.factorial(4));
        assertEquals(1, Recursion.factorial(0));
        assertEquals(1, Recursion.factorial(1));
    }

    @Test
    void shouldReturnFibonacci() {
        assertEquals(5, Recursion.fibonacci(5));
        assertEquals(21, Recursion.fibonacci(8));
        assertEquals(0, Recursion.fibonacci(0));
        assertEquals(1, Recursion.fibonacci(1));
    }
}