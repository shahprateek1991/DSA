package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuideWireTest {

    @Test
    void name() {
        assertEquals(162534, GuideWire.solution(123456));
        assertEquals(102030, GuideWire.solution(123000));
        assertEquals(0, GuideWire.solution(0));
        assertEquals(5, GuideWire.solution(5));
    }

    @Test
    void name1() {
        assertEquals(3, GuideWire.domino(new int[] {2,4,1,3,4,6,2,4,1,6}));
        assertEquals(7, GuideWire.domino(new int[] {5,1,2,6,6,1,3,1,4,3,4,3,4,6,1,2,4,1,6,2}));
        assertEquals(2, GuideWire.domino(new int[] {1,5,3,3,1,3}));
        assertEquals(0, GuideWire.domino(new int[] {3,4}));
        assertEquals(2, GuideWire.domino(new int[] {0,1,0,2,1,3,2,4}));
        assertEquals(2, GuideWire.domino(new int[] {0,3,3,1,2,1,4,0}));
        assertEquals(1, GuideWire.domino(new int[] {2,4,4,6,6,8,9,10}));
        assertEquals(2, GuideWire.domino(new int[] {2,4,4,6,4,8,8,10,6,8}));
    }
}