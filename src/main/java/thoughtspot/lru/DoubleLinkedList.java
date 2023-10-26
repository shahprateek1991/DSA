package thoughtspot.lru;

public class DoubleLinkedList {
    private Node start;
    private Node tail;

    public DoubleLinkedList() {

    }

    public Node addAtFront(int value) {
        if (start == null) {
            start = new Node();
            start.value = value;
            tail = start;
        } else {
            Node newNode = new Node();
            newNode.next = start;
            newNode.value = value;
            start.previous = newNode;

            start = newNode;
        }

        return start;
    }

    public void putElementToFront(Node node) {
        if(node == start) return;

        if (node.next == null) {
            node.previous.next = null;
            tail = node.previous;
        } else {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }

        addToFront(node);
    }

    private void addToFront(Node node) {
        node.next = start;
        start.previous = node;

        start = node;
    }

    public static class Node {
        private Node previous;
        private Node next;
        private int value;
    }
}
