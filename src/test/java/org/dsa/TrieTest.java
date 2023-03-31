package org.dsa;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    void shouldSearchElementInTheTrie() {
        Trie trie = new Trie(List.of("bat", "cat", "bad", "element", "ca"));

        assertFalse(trie.search("qwe"));
        assertTrue(trie.search("ca"));
        assertTrue(trie.search("cat"));
        assertFalse(trie.search("ele"));
        assertTrue(trie.search("element"));
    }

    @Test
    void shouldInsertElementInTheTrie() {
        Trie trie = new Trie(List.of("bat", "cat", "bad", "element", "ca"));

        assertFalse(trie.search("qwe"));

        trie.insert("qwe");

        assertTrue(trie.search("qwe"));
    }

    @Test
    void shouldDeleteElementInTheTrie() {
        Trie trie = new Trie(List.of("bat", "cat", "bad", "element", "ca"));

        assertTrue(trie.search("bat"));
        assertTrue(trie.search("cat"));
        assertTrue(trie.search("bad"));
        assertTrue(trie.search("element"));
        assertTrue(trie.search("ca"));

        trie.delete("bat");
        trie.delete("ca");
        trie.delete("element");

        assertFalse(trie.search("bat"));
        assertTrue(trie.search("bad"));

        assertFalse(trie.search("ca"));
        assertTrue(trie.search("cat"));

        assertFalse(trie.search("element"));
    }
}