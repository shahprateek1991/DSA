package org.dsa.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void shouldAddElementAtTheLastPosition() {
        Array array = new Array();

        array.add(100);
        array.add(500);

        assertArrayEquals(new int[]{100, 500}, array.getArray());
    }
}