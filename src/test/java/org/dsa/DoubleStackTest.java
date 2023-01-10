package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleStackTest {

    @Test
    void shouldPushPopElementInBothStacks() {
        DoubleStack doubleStack = new DoubleStack(5);
        assertTrue(doubleStack.push1(10));
        assertTrue(doubleStack.push1(20));
        assertTrue(doubleStack.push1(30));
        assertTrue(doubleStack.push1(40));
        assertTrue(doubleStack.push1(50));
        assertFalse(doubleStack.push1(100));
        assertFalse(doubleStack.push2(20));
        assertEquals(-1, doubleStack.pop2());
        assertEquals(50, doubleStack.pop1());
        assertTrue(doubleStack.push2(50));
        assertFalse(doubleStack.push2(70));
    }
}