package org.dsa.math;

import org.dsa.PalindromeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void shouldReturnTrueGivenASingleDigitNumber() {
        assertTrue(PalindromeNumber.isPalindrome(0));
        assertTrue(PalindromeNumber.isPalindrome(8));
        assertTrue(PalindromeNumber.isPalindrome(7));
    }

    @Test
    void shouldReturnTrueGivenAPalindromeNumberWithOddLength() {
        assertTrue(PalindromeNumber.isPalindrome(121));
        assertTrue(PalindromeNumber.isPalindrome(55555));
        assertTrue(PalindromeNumber.isPalindrome(85258));
        assertTrue(PalindromeNumber.isPalindrome(9874789));
    }

    @Test
    void shouldReturnTrueGivenAPalindromeNumberWithEvenLength() {
        assertTrue(PalindromeNumber.isPalindrome(1221));
        assertTrue(PalindromeNumber.isPalindrome(555555));
        assertTrue(PalindromeNumber.isPalindrome(852258));
        assertTrue(PalindromeNumber.isPalindrome(98744789));
    }

    @Test
    void shouldReturnFalseGivenANonPalindromeNumber() {
        assertFalse(PalindromeNumber.isPalindrome(654));
        assertFalse(PalindromeNumber.isPalindrome(874651));
        assertFalse(PalindromeNumber.isPalindrome(5151));
        assertFalse(PalindromeNumber.isPalindrome(123456));
    }
}