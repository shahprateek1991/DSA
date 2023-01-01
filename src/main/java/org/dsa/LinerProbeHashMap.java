package org.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ChainingHashMap<V> {

    private final int capacity;
    private int size;
    private List<LinkedList<Entry<V>>> hashTable;


    public ChainingHashMap(int capacity) {
        this.capacity = capacity;
        size = 0;
        hashTable = new ArrayList<>(capacity);
        initialize();
    }

    public void put(int key, V value) {
        int index = index(key);
        LinkedList<Entry<V>> entries = hashTable.get(index);
        if (entries.size() != 0) {
            for (int i = 0; i < entries.size(); i++) {
                if (entries.get(i).key == key) {
                    entries.remove(i);
                    entries.add(i, new Entry<>(key, value));
                    return;
                }
            }
        }
        entries.add(new Entry<>(key, value));
        size++;
    }

    public V get(int key) {
        int index = index(key);
        for (Entry<V> entry : hashTable.get(index)) {
            if (entry.key == key) return entry.value;
        }

        return null;
    }

    private int index(int key) {
        return key % capacity;
    }

    private void initialize(){
        for (int i = 0; i< capacity; i++)
            hashTable.add(new LinkedList<>());
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
