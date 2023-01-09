package org.dsa;

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

    @Test
    void shouldReturnSumOfNaturalNumbers() {
        assertEquals(15, Recursion.sumOfNaturalNumbers(5));
        assertEquals(36, Recursion.sumOfNaturalNumbers(8));
        assertEquals(1, Recursion.sumOfNaturalNumbers(1));
    }

    @Test
    void shouldCheckIfStringIsPalindrome() {
        assertTrue(Recursion.isPalindrome("abcba"));
        assertTrue(Recursion.isPalindrome("asdfghjklkjhgfdsa"));
        assertFalse(Recursion.isPalindrome("uhksgdfidshfgvfd"));
        assertTrue(Recursion.isPalindrome("a"));
        assertFalse(Recursion.isPalindrome("ab"));
    }

    @Test
    void shouldReturnSumOfDigits() {
        assertEquals(6, Recursion.sumOfDigits(123));
        assertEquals(20, Recursion.sumOfDigits(45821));
        assertEquals(0, Recursion.sumOfDigits(0));
        assertEquals(8, Recursion.sumOfDigits(8));
    }

    @Test
    void shouldReturnMaximumRopeCuts() {
        assertEquals(2,Recursion.maximumCutForRope(23,11,9,12));
        assertEquals(-1,Recursion.maximumCutForRope(9,2,2,2));
        assertEquals(5,Recursion.maximumCutForRope(5,2,5,1));
    }

    @Test
    void shouldPrintTowerOfHanoiSequence() {
        Recursion.towerOfHanoi(4 , 'a', 'b', 'c');
    }
}