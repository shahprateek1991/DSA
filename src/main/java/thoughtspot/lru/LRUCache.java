package thoughtspot.lru;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private Map<Integer, Entry> cache;
    private DoubleLinkedList recentlyUsedElements;
    int size;

    public LRUCache(int size) {
        this.cache = new HashMap<>(size);
        this.size = size;
    }

    public void put(Integer key, Integer value) {
        if (cache.containsKey(key)) {
            Entry entry = cache.get(key);
            recentlyUsedElements.putElementToFront(entry.address);
            cache.put(key, new Entry(value, entry.address));
        } else {
            if (cache.size() < this.size) {
                DoubleLinkedList.Node node = recentlyUsedElements.addAtFront(value);
                cache.put(key, new Entry(value, node));
            } else  {

            }
        }

    }

    public Integer get (Integer key) {
        if (cache.containsKey(key)) {
            recentlyUsedElements.putElementToFront(cache.get(key).address);
        }
        return cache.get(key).value;
    }

    public static class Entry {
        private int value;
        private DoubleLinkedList.Node address;

        public Entry(int value, DoubleLinkedList.Node address) {
            this.value = value;
            this.address = address;
        }
    }


}
