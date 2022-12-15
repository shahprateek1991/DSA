package org.dsa.math;

import java.util.Arrays;

public class Array {
    private int[] array;
    private int nextAvailableIndex;

    public Array() {
        this(10);

    }

    public Array(int size) {
        array = new int[size];
        nextAvailableIndex = 0;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, nextAvailableIndex);
    }

    public void add(int element) {
        array[nextAvailableIndex] = element;
        nextAvailableIndex++;
    }
}
