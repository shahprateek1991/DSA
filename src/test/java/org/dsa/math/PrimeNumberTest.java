package org.dsa.math;

import org.dsa.PrimeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void shouldReturnTrueIfNumberIsTwo() {
        assertTrue(PrimeNumber.isPrime(2));
    }

    @Test
    void shouldReturnFalseIfNumberIsEvenAndGreaterThan2() {
        assertFalse(PrimeNumber.isPrime(20));
        assertFalse(PrimeNumber.isPrime(8));
        assertFalse(PrimeNumber.isPrime(6));
        assertFalse(PrimeNumber.isPrime(18));
    }

    @Test
    void shouldReturnFalseIfNumberIsNotPrime() {
        assertFalse(PrimeNumber.isPrime(9));
        assertFalse(PrimeNumber.isPrime(15));
        assertFalse(PrimeNumber.isPrime(21));
    }

    @Test
    void shouldReturnTrueIfNumberIsPrime() {
        assertTrue(PrimeNumber.isPrime(7));
        assertTrue(PrimeNumber.isPrime(17));
        assertTrue(PrimeNumber.isPrime(31));
    }

    @Test
    void shouldReturnTrueIfNumberIsTwo_usingSqrtMethod() {
        assertTrue(PrimeNumber.isPrimeUsingRootMethod(2));
    }

    @Test
    void shouldReturnFalseIfNumberIsEvenAndGreaterThan2_usingSqrtMethod() {
        assertFalse(PrimeNumber.isPrimeUsingRootMethod(20));
        assertFalse(PrimeNumber.isPrimeUsingRootMethod(8));
        assertFalse(PrimeNumber.isPrimeUsingRootMethod(6));
        assertFalse(PrimeNumber.isPrimeUsingRootMethod(18));
    }

    @Test
    void shouldReturnFalseIfNumberIsNotPrime_usingSqrtMethod() {
        assertFalse(PrimeNumber.isPrimeUsingRootMethod(9));
        assertFalse(PrimeNumber.isPrimeUsingRootMethod(15));
        assertFalse(PrimeNumber.isPrimeUsingRootMethod(21));
    }

    @Test
    void shouldReturnTrueIfNumberIsPrime_usingSqrtMethod() {
        assertTrue(PrimeNumber.isPrimeUsingRootMethod(7));
        assertTrue(PrimeNumber.isPrimeUsingRootMethod(17));
        assertTrue(PrimeNumber.isPrimeUsingRootMethod(31));
    }
}