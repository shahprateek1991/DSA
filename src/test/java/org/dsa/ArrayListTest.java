package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayListTest {

    @Test
    void shouldAddElementAtTheLastPosition() {
        ArrayList arrayList = new ArrayList();

        arrayList.add(100);
        arrayList.add(500);

        assertArrayEquals(new int[]{100, 500}, arrayList.getArray());
    }
}