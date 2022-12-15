package org.dsa.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    @Test
    void shouldAddElementAtTheLastPosition() {
        ArrayList arrayList = new ArrayList();

        arrayList.add(100);
        arrayList.add(500);

        assertArrayEquals(new int[]{100, 500}, arrayList.getArray());
    }
}