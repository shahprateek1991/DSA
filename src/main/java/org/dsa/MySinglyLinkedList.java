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

    public void add(int index, T data) {
        if (size == 0) {
            head = new Node<>(data);
            size++;
            return;
        }

        if (index >=size) return;

        if (index == 0) {
            addAtBeginning(data);
            return;
        }


        Node<T> current = head;
        for (int i = 0; i < index-1; i++) {
            current  = current.next;
        }

        Node<T> newNode = new Node<>(data);
        newNode.next = current.next;
        current.next = newNode;
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

    public T deleteFirst() {
        if (head == null) return null;
        Node<T> temp = head;
        head = head.next;
        size--;

        return temp.data;
    }

    public T deletedLast() {
        if (head == null) return null;
        if(head.next == null) {
            T deleted = head.data;
            head = null;
            size--;
            return deleted;
        }
        Node<T> temp = head;
        while (temp.next.next !=null) {
            temp = temp.next;
        }
        T deleted = temp.next.data;
        temp.next = null;
        size--;

        return deleted;
    }

    public int search(T data) {
        Node<T> current = head;
        int index = 0;
        while (current !=null) {
            if (current.data == data) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    public int searchRecursive(T data) {
        return searchRecursive(data, head);
    }

    private int searchRecursive(T data, Node<T> current) {
        if (current == null) return -1;
        if (current.data == data) return 0;
        int result = searchRecursive(data, current.next);

        return result == -1 ? -1 : 1+result;
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
