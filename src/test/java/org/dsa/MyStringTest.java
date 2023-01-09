package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringTest {

    @Test
    void shouldCheckIfOneStringIsSunSequenceOfOther() {
        assertTrue(MyString.isSubSequence("abc", "ac"));
        assertFalse(MyString.isSubSequence("ab", "abc"));
        assertFalse(MyString.isSubSequence("abcde", "af"));
        assertFalse(MyString.isSubSequence("abcde", "aed"));
        assertTrue(MyString.isSubSequence("abc", "bc"));
        assertTrue(MyString.isSubSequence("abcd", "ad"));
    }

    @Test
    void shouldCheckIfOneStringIsSunSequenceOfOther_Recursively() {
        assertTrue(MyString.isSubSequenceRecursive("abc", "ac"));
        assertFalse(MyString.isSubSequenceRecursive("ab", "abc"));
        assertFalse(MyString.isSubSequenceRecursive("abcde", "af"));
        assertFalse(MyString.isSubSequenceRecursive("abcde", "aed"));
        assertTrue(MyString.isSubSequenceRecursive("abc", "bc"));
        assertTrue(MyString.isSubSequenceRecursive("abcd", "ad"));
    }

    @Test
    void shouldReverseWordsInString() {
        assertEquals("dcba fed zyx", MyString.reverseWords("abcd def xyz"));
        assertEquals(" ", MyString.reverseWords(" "));
        assertEquals(" abcde", MyString.reverseWords(" edcba"));
        assertEquals("abcde ", MyString.reverseWords("edcba "));
        assertEquals("abcde", MyString.reverseWords("edcba"));
        assertEquals(" abcde ", MyString.reverseWords(" edcba "));
    }
}