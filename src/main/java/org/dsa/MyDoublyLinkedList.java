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
