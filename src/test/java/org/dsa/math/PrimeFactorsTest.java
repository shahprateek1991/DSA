package org.dsa.math;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {

    @Test
    void shouldReturnPrimeFactorsOfAGivenNumber() {
        assertEquals(List.of(2,2,3), PrimeFactors.primeFactorsBruteForce(12));
        assertEquals(List.of(13), PrimeFactors.primeFactorsBruteForce(13));
        assertEquals(List.of(3,3,5,7), PrimeFactors.primeFactorsBruteForce(315));
        assertEquals(List.of(2, 3, 3, 5, 5), PrimeFactors.primeFactorsBruteForce(450));
        assertEquals(List.of(2, 2, 3, 7), PrimeFactors.primeFactorsBruteForce(84));
    }

    @Test
    void shouldReturnPrimeFactorsOfAGivenNumber_WithEfficientMethod() {
        assertEquals(List.of(2,2,3), PrimeFactors.primeFactorsEfficient(12));
        assertEquals(List.of(13), PrimeFactors.primeFactorsEfficient(13));
        assertEquals(List.of(3,3,5,7), PrimeFactors.primeFactorsEfficient(315));
        assertEquals(List.of(2, 3, 3, 5, 5), PrimeFactors.primeFactorsEfficient(450));
        assertEquals(List.of(2, 2, 3, 7), PrimeFactors.primeFactorsEfficient(84));

    }
}