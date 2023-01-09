package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchTest {

    @Test
    void shouldFindElementInArrayUsingBinarySearch() {
        assertEquals(1, Search.binarySearch(new int[] {1,2,3,4,5,6,7}, 2));
        assertEquals(-1, Search.binarySearch(new int[] {1,2,3,4,5,6,7}, 8));
        assertEquals(6, Search.binarySearch(new int[] {1,2,3,4,5,6,7}, 7));
        assertEquals(0, Search.binarySearch(new int[] {1,2,3,4,5,6,7}, 1));
    }
}