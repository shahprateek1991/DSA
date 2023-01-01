package org.dsa;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {

    @Test
    void shouldStoreValuesInTheMap() {
        MyHashMap<String> map = new MyHashMap<>(20);
        map.put(1, "Alan Kay");
        map.put(3, "Linus Torwald");

        assertEquals("Alan Kay", map.get(1));
        assertEquals("Linus Torwald", map.get(3));
        assertNull(map.get(8));

    }

    @Test
    void shouldOverrideValuesInTheMapGivenDuplicateKey() {
        MyHashMap<String> map = new MyHashMap<>(20);
        map.put(1, "Alan Kay");
        map.put(1, "Linus Torwald");

        assertEquals("Linus Torwald", map.get(1));
    }

    @Test
    void shouldReturnSizeOfTheMap() {
        MyHashMap<String> map = new MyHashMap<>(20);
        map.put(1, "Alan Kay");
        map.put(1, "Linus Torwald");

        assertEquals(1, map.size());
    }

    @Test
    void shouldReturnSizeOfTheMapGivenMultipleEntries() {
        MyHashMap<String> map = new MyHashMap<>(20);
        map.put(1, "Alan Kay");
        map.put(21, "Linus Torwald");
        map.put(5, "Linus Torwald");

        assertEquals(3, map.size());
    }
}