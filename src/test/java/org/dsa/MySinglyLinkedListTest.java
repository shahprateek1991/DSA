package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySinglyLinkedListTest {

    @Test
    void shouldAddEntriesAtBeginningOfTheList() {
        MySinglyLinkedList<String> linkedList = new MySinglyLinkedList<>();

        linkedList.addAtBeginning("Three");
        linkedList.addAtBeginning("Two");
        linkedList.addAtBeginning("One");

        assertEquals(3, linkedList.size());
        assertEquals("One", linkedList.get(0));
        assertEquals("Two", linkedList.get(1));
        assertEquals("Three", linkedList.get(2));
        assertNull( linkedList.get(3));
    }

    @Test
    void shouldAddEntriesAtEndOfTheList() {
        MySinglyLinkedList<String> linkedList = new MySinglyLinkedList<>();

        linkedList.addAtEnd("One");
        linkedList.addAtEnd("Two");
        linkedList.addAtEnd("Three");

        assertEquals(3, linkedList.size());
        assertEquals("One", linkedList.get(0));
        assertEquals("Two", linkedList.get(1));
        assertEquals("Three", linkedList.get(2));
        assertNull( linkedList.get(3));
    }

    @Test
    void shouldPrintListRecursively() {
        MySinglyLinkedList<String> linkedList = new MySinglyLinkedList<>();

        linkedList.addAtEnd("One");
        linkedList.addAtEnd("Two");
        linkedList.addAtEnd("Three");

        linkedList.printRecursively();
    }
}