package org.dsa.math;

import org.dsa.GCD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    @Test
    void shouldReturnOneAsGCDGivenTwoNumbersDoesNotHaveCommonFactors_UsingNaiveMethod() {
        assertEquals(1, GCD.gcdNaive(3,5));
        assertEquals(1, GCD.gcdNaive(9,10));
        assertEquals(1, GCD.gcdNaive(13,7));
        assertEquals(1, GCD.gcdNaive(1,1));
        assertEquals(1, GCD.gcdNaive(1,2));
    }

    @Test
    void shouldReturnGCDGivenTwoNumbersHaveCommonFactors_UsingNaiveMethod() {
        assertEquals(2, GCD.gcdNaive(4,2));
        assertEquals(5, GCD.gcdNaive(5,10));
        assertEquals(7, GCD.gcdNaive(28,21));
        assertEquals(16, GCD.gcdNaive(16,64));
    }

    @Test
    void shouldReturnOneAsGCDGivenTwoNumbersDoesNotHaveCommonFactors_UsingEuclideanMethod() {
        assertEquals(1, GCD.euclideanGCD(3,5));
        assertEquals(1, GCD.euclideanGCD(9,10));
        assertEquals(1, GCD.euclideanGCD(13,7));
        assertEquals(1, GCD.euclideanGCD(1,1));
        assertEquals(1, GCD.euclideanGCD(1,2));
    }

    @Test
    void shouldReturnGCDGivenTwoNumbersHaveCommonFactors_UsingEuclideanMethod() {
        assertEquals(2, GCD.euclideanGCD(4,2));
        assertEquals(5, GCD.euclideanGCD(5,10));
        assertEquals(7, GCD.euclideanGCD(28,21));
        assertEquals(16, GCD.euclideanGCD(16,64));
    }

    @Test
    void shouldReturnOneAsGCDGivenTwoNumbersDoesNotHaveCommonFactors_UsingEuclideanOptimizedMethod() {
        assertEquals(1, GCD.euclideanOptimizedGCD(3,5));
        assertEquals(1, GCD.euclideanOptimizedGCD(9,10));
        assertEquals(1, GCD.euclideanOptimizedGCD(13,7));
        assertEquals(1, GCD.euclideanOptimizedGCD(1,1));
        assertEquals(1, GCD.euclideanOptimizedGCD(1,2));
    }

    @Test
    void shouldReturnGCDGivenTwoNumbersHaveCommonFactors_UsingEuclideanOptimizedMethod() {
        assertEquals(2, GCD.euclideanOptimizedGCD(4,2));
        assertEquals(5, GCD.euclideanOptimizedGCD(5,10));
        assertEquals(7, GCD.euclideanOptimizedGCD(28,21));
        assertEquals(16, GCD.euclideanOptimizedGCD(16,64));
    }
}