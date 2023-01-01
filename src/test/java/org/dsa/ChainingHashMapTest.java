package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainingHashMapTest {

    @Test
    void shouldStoreValuesInTheMap() {
        ChainingHashMap<String> map = new ChainingHashMap<>(20);
        map.put(1, "Alan Kay");
        map.put(3, "Linus Torwald");

        assertEquals("Alan Kay", map.get(1));
        assertEquals("Linus Torwald", map.get(3));
        assertNull(map.get(8));

    }

    @Test
    void shouldOverrideValuesInTheMapGivenDuplicateKey() {
        ChainingHashMap<String> map = new ChainingHashMap<>(20);
        map.put(1, "Alan Kay");
        map.put(1, "Linus Torwald");

        assertEquals("Linus Torwald", map.get(1));
    }

    @Test
    void shouldReturnSizeOfTheMap() {
        ChainingHashMap<String> map = new ChainingHashMap<>(20);
        map.put(1, "Alan Kay");
        map.put(1, "Linus Torwald");

        assertEquals(1, map.size());
    }

    @Test
    void shouldReturnSizeOfTheMapGivenMultipleEntries() {
        ChainingHashMap<String> map = new ChainingHashMap<>(20);
        map.put(1, "Alan Kay");
        map.put(21, "Linus Torwald");
        map.put(5, "Linus Torwald");

        assertEquals(3, map.size());
    }

    @Test
    void shouldRemoveEntryFromTheMap() {
        ChainingHashMap<String> map = new ChainingHashMap<>(20);
        map.put(1, "Alan Kay");
        map.put(3, "Linus Torwald");

        String deleteEntry = map.delete(3);

        assertNull(map.get(3));
        assertEquals("Linus Torwald", deleteEntry);
    }
}