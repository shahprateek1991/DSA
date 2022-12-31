package org.dsa;

import java.util.Arrays;

public class ArrayList {
    private int[] array;
    private int nextAvailableIndex;

    public ArrayList() {
        this(10);

    }

    public ArrayList(int size) {
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
