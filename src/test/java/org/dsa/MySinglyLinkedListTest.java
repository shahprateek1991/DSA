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

    @Test
    void shouldDeleteFirstEntryOfList() {
        MySinglyLinkedList<String> linkedList = new MySinglyLinkedList<>();

        linkedList.addAtEnd("One");
        linkedList.addAtEnd("Two");
        linkedList.addAtEnd("Three");

        String deleted = linkedList.deleteFirst();

        assertEquals(2, linkedList.size());
        assertEquals("One", deleted);
        assertEquals("Two", linkedList.get(0));
        assertEquals("Three", linkedList.get(1));
    }

    @Test
    void shouldReturnNullWhenPerformingDeleteFirstOnEmptyList() {
        MySinglyLinkedList<String> linkedList = new MySinglyLinkedList<>();

        String deleted = linkedList.deleteFirst();

        assertNull(deleted);
    }

    @Test
    void shouldDeleteLastEntryOfList() {
        MySinglyLinkedList<String> linkedList = new MySinglyLinkedList<>();

        linkedList.addAtEnd("One");
        linkedList.addAtEnd("Two");
        linkedList.addAtEnd("Three");

        String deleted = linkedList.deletedLast();

        assertEquals(2, linkedList.size());
        assertEquals("Three", deleted);
        assertEquals("One", linkedList.get(0));
        assertEquals("Two", linkedList.get(1));
    }

    @Test
    void shouldReturnNullWhenPerformingDeleteLastOnEmptyList() {
        MySinglyLinkedList<String> linkedList = new MySinglyLinkedList<>();

        String deleted = linkedList.deletedLast();

        assertNull(deleted);
    }

    @Test
    void shouldDeletedLastFromListGivenSingleElementInTheList() {
        MySinglyLinkedList<String> linkedList = new MySinglyLinkedList<>();
        linkedList.addAtBeginning("One");

        String deleted = linkedList.deletedLast();

        assertEquals("One", deleted);
        assertEquals(0, linkedList.size());
    }

    @Test
    void shouldAddAtGivenIndex() {
        MySinglyLinkedList<String> linkedList = new MySinglyLinkedList<>();
        linkedList.add(0, "One");

        assertEquals(1, linkedList.size());
        assertEquals("One", linkedList.get(0));

        linkedList.add(0, "Before One");

        assertEquals(2, linkedList.size());
        assertEquals("Before One", linkedList.get(0));
        assertEquals("One", linkedList.get(1));

        linkedList.add(1, "Second");

        assertEquals(3, linkedList.size());
        assertEquals("Before One", linkedList.get(0));
        assertEquals("Second", linkedList.get(1));
        assertEquals("One", linkedList.get(2));

        linkedList.add(2, "Second Second");

        assertEquals(4, linkedList.size());
        assertEquals("Before One", linkedList.get(0));
        assertEquals("Second", linkedList.get(1));
        assertEquals("Second Second", linkedList.get(2));
        assertEquals("One", linkedList.get(3));
    }

    @Test
    void shouldDonNothingIfGivenIndexIsGraterThanTheSizeOfTheList() {
        MySinglyLinkedList<String> linkedList = new MySinglyLinkedList<>();
        linkedList.addAtEnd("Three");
        linkedList.addAtEnd("Two");
        linkedList.addAtEnd("One");

        linkedList.add(5, "Invalid");

        assertEquals(3, linkedList.size());
    }
}