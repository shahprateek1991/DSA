package org.dsa;

public class MyDoublyLinkedList<T> {

    private Node<T> head;
    private int size;

    public MyDoublyLinkedList() {
        this.size = 0;
    }

    public void addAtBeginning(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            size++;
            return;
        }
        head.previous = node;
        node.next = head;
        head = node;
        size++;
    }

    public void addAtEnd(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            size++;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        node.previous = current;
        size++;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index >=size) return null;
        Node<T> current = head;
        for (int i = 0; i<index;i++) {
            current = current.next;
        }

        return current.data;
    }

    public T deleteFirst() {
        if (head == null) return null;
        T deletedData = head.data;

        if (size == 1) {
            size--;
            head = null;
            return deletedData;
        }

        size--;
        head = head.next;
        head.previous = null;
        return deletedData;
    }

    public T deleteLast() {
        if (head == null) return null;

        if (size == 1) {
            size--;
            T deletedData = head.data;
            head = null;
            return deletedData;
        }

        Node<T> current = head;
        while (current.next.next !=null) {
            current = current.next;
        }
        T deletedData = current.next.data;
        size--;
        current.next = null;
        return deletedData;
    }

    public void reverse() {
        if (head == null || head.next == null) return;

        Node<T> current = head;
        Node<T> prev = null;
        while (current != null) {
            prev = current.previous;
            current.previous = current.next;
            current.next = prev;

            current= current.previous;
        }

        head = prev.previous;
    }

    public static class Node<T> {
        private T data;
        private Node<T> previous;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<T> currentNode = this.head;
        while (currentNode != null) {
            stringBuilder.append(currentNode.data).append("->");
            currentNode = currentNode.next;
        }

        return stringBuilder.toString();
    }
}
