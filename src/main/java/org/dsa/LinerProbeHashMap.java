package org.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TODO: Implement this
public class LinerProbeHashMap<V> {

    private final int capacity;
    private int size;
    private List<Entry<V>> hashTable;

    private Entry<V> DELETED_ENTRY = new Entry<>(0, null);


    public LinerProbeHashMap(int capacity) {
        this.capacity = capacity;
        size = 0;
        hashTable = new ArrayList<>(capacity);
    }

    public void put(int key, V value) {
        int index = index(key);
        Entry<V> entry = hashTable.get(index);
    }

    public V get(int key) {

        return null;
    }

    private int index(int key) {
        return key % capacity;
    }

    public int size() {
        return size;
    }

    public static class Entry<V> {
        private final int key;
        private final V value;

        public Entry(Integer key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
