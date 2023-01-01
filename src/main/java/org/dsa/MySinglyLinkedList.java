package org.dsa;

public class MySinglyLinkedList<T> {

    private Node<T> head;
    private int size;

    public MySinglyLinkedList() {
        this.size = 0;
    }

    public void addAtBeginning(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> newNode = new Node<T>(data);
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addAtEnd(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> newNode = new Node<T>(data);
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public T get(int index) {
        if (index >= size) return null;
        Node<T> current  = head;
        for (int i = 0; i<index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public int size() {
        return size;
    }

    public void printRecursively() {
        if (head == null) return;
        printRecursively(head);
    }

    private void printRecursively(Node<T> node) {
        System.out.println(" " + node.data);
        if (node.next == null) return;
        printRecursively(node.next);
    }

    public static class Node<T> {
        private T data;
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
