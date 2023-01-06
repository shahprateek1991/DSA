package org.dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyDoublyLinkedListTest {

    @Test
    void shouldAddEntriesAtBeginningOfTheList() {
        MyDoublyLinkedList<String> linkedList = new MyDoublyLinkedList<>();

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
    void shouldReverseDoublyLinkedList() {
        MyDoublyLinkedList<String> linkedList = new MyDoublyLinkedList<>();

        linkedList.addAtBeginning("Three");
        linkedList.addAtBeginning("Two");
        linkedList.addAtBeginning("One");

        linkedList.reverse();

        assertEquals("One", linkedList.get(2));
        assertEquals("Two", linkedList.get(1));
        assertEquals("Three", linkedList.get(0));
    }

    @Test
    void shouldDeleteFirstElementFromDoubleLinkedList() {

        MyDoublyLinkedList<String> linkedList = new MyDoublyLinkedList<>();

        linkedList.addAtBeginning("Three");
        linkedList.addAtBeginning("Two");
        linkedList.addAtBeginning("One");

        String deletedData = linkedList.deleteFirst();

        assertEquals(2, linkedList.size());
        assertEquals("One", deletedData);
        assertEquals("Two", linkedList.get(0));
        assertEquals("Three", linkedList.get(1));
    }

    @Test
    void shouldDeleteFirstElementFromDoubleLinkedListWithOneElement() {

        MyDoublyLinkedList<String> linkedList = new MyDoublyLinkedList<>();

        linkedList.addAtBeginning("One");

        String deletedData = linkedList.deleteFirst();

        assertEquals(0, linkedList.size());
        assertEquals("One", deletedData);
    }

    @Test
    void shouldDeleteFirstElementFromDoubleLinkedListWithNoElement() {

        MyDoublyLinkedList<String> linkedList = new MyDoublyLinkedList<>();


        String deletedData = linkedList.deleteFirst();

        assertEquals(0, linkedList.size());
        assertNull(deletedData);
    }

    @Test
    void shouldDeleteLastElementFromDoubleLinkedList() {

        MyDoublyLinkedList<String> linkedList = new MyDoublyLinkedList<>();

        linkedList.addAtBeginning("Three");
        linkedList.addAtBeginning("Two");
        linkedList.addAtBeginning("One");

        String deletedData = linkedList.deleteLast();

        assertEquals(2, linkedList.size());
        assertEquals("Three", deletedData);
        assertEquals("One", linkedList.get(0));
        assertEquals("Two", linkedList.get(1));
        assertNull(linkedList.get(2));
    }

    @Test
    void shouldDeleteLastElementFromDoubleLinkedListWithOneElement() {

        MyDoublyLinkedList<String> linkedList = new MyDoublyLinkedList<>();

        linkedList.addAtBeginning("One");

        String deletedData = linkedList.deleteLast();

        assertEquals(0, linkedList.size());
        assertEquals("One", deletedData);
    }

    @Test
    void shouldDeleteLastElementFromDoubleLinkedListWithNoElement() {

        MyDoublyLinkedList<String> linkedList = new MyDoublyLinkedList<>();


        String deletedData = linkedList.deleteLast();

        assertEquals(0, linkedList.size());
        assertNull(deletedData);
    }
}