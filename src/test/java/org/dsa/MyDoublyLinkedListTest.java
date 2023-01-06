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
        System.out.println(linkedList);
        assertEquals("One", linkedList.get(0));
        assertEquals("Two", linkedList.get(1));
        assertEquals("Three", linkedList.get(2));
        assertNull( linkedList.get(3));
    }

}