package org.dsa.math;

import org.dsa.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void shouldReturnOneGivenFactorialOfZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    void shouldReturnFactorialOfNonZeroNumbers() {
        assertEquals(720, Factorial.factorial(6));
        assertEquals(120, Factorial.factorial(5));
        assertEquals(24, Factorial.factorial(4));
        assertEquals(6, Factorial.factorial(3));
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    void shouldReturnOneGivenFactorialOfZeroWithRecursive() {
        assertEquals(1, Factorial.factorialRecursive(0));
    }

    @Test
    void shouldReturnFactorialOfNonZeroNumbersRecursive() {
        assertEquals(720, Factorial.factorialRecursive(6));
        assertEquals(120, Factorial.factorialRecursive(5));
        assertEquals(24, Factorial.factorialRecursive(4));
        assertEquals(6, Factorial.factorialRecursive(3));
        assertEquals(1, Factorial.factorialRecursive(1));
    }

    @Test
    void shouldReturnZeroGivenNoTrailingZeroInFactorialOfAGivenNumber() {
        assertEquals(0, Factorial.trailingZeroInFactorial(1));
        assertEquals(0, Factorial.trailingZeroInFactorial(3));
        assertEquals(0, Factorial.trailingZeroInFactorial(4));
    }

    @Test
    void shouldReturnTrailingZeroForFactorialOfAGivenNumberThatDoesNotHaveMultipleOfFives() {
        assertEquals(1, Factorial.trailingZeroInFactorial(5));
        assertEquals(1, Factorial.trailingZeroInFactorial(8));
        assertEquals(2, Factorial.trailingZeroInFactorial(10));
        assertEquals(2, Factorial.trailingZeroInFactorial(13));
    }

    @Test
    void shouldReturnTrailingZeroForFactorialOfAGivenNumberThatDoesHaveMultipleOfFives() {
        assertEquals(6, Factorial.trailingZeroInFactorial(25));
        assertEquals(31, Factorial.trailingZeroInFactorial(126));
    }
}