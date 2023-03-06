package org.dsa;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<T> {
    private Node<T> root;

    public BinaryTree(T root) {
        this.root = new Node<>(root);
    }

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    public List<T> preOrderTraversal() {
        List<T> results = new ArrayList<>();
        preOrderTraversal(root, results);

        return results;
    }

    public List<T> inOrderTraversal() {
        List<T> results = new ArrayList<>();
        inOrderTraversal(root, results);

        return results;
    }

    public List<T> postOrderTraversal() {
        List<T> results = new ArrayList<>();
        postOrderTraversal(root, results);

        return results;
    }

    public int height() {
        return height(root);
    }

    private int height(Node<T> node) {
        if (node == null) return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    private void preOrderTraversal(Node<T> node, List<T> result) {
        if (node != null) {
            result.add(node.data);
            preOrderTraversal(node.left, result);
            preOrderTraversal(node.right, result);
        }
    }

    private void inOrderTraversal(Node<T> node, List<T> result) {
        if (node != null) {
            inOrderTraversal(node.left, result);
            result.add(node.data);
            inOrderTraversal(node.right, result);
        }
    }

    private void postOrderTraversal(Node<T> node, List<T> result) {
        if (node != null) {
            postOrderTraversal(node.left, result);
            postOrderTraversal(node.right, result);
            result.add(node.data);
        }
    }

    public List<T> nodesAt(int distance) {
        List<T> results = new ArrayList<>();
        nodesAt(this.root, results, distance);
        return results;
    }

    private void nodesAt(Node<T> node, List<T> result, int distance) {
        if (node == null) return;
        if (distance == 0) {
            result.add(node.data);
            return;
        }
        nodesAt(node.left, result, distance-1);
        nodesAt(node.right, result, distance-1);
    }

    public List<T> bfs() {
        List<T> results = new ArrayList<>();
        Queue<Node<T>> traversalQueue = new ArrayDeque<>();
        traversalQueue.add(this.root);
        while ( !traversalQueue.isEmpty()) {
            Node<T> tNode = traversalQueue.poll();
            results.add(tNode.data);
            if (tNode.left != null) traversalQueue.offer(tNode.left);
            if (tNode.right != null) traversalQueue.offer(tNode.right);
        }
        return results;
    }

    public boolean isBalanced() {
        int results = isBalanced(this.root);
        return results != -1;
    }

    private int isBalanced(Node<T> node) {
        if (node == null) return 0;
        int left = isBalanced(node.left);
        if (left == -1) return -1;

        int right = isBalanced(node.right);
        if (right == -1) return -1;

        return (Math.abs(left - right) > 1) ? -1 : (Math.max(left, right) + 1);
    }

    public static boolean isChildrenSumPropertyApplicable(Node<Integer> node) {
        if (node == null) return true;
        if (node.left == null && node.right == null) return true;
        int sum = 0;
        if (node.left != null) sum = sum + node.left.data;
        if (node.right != null) sum = sum + node.right.data;

        return (node.data == sum)
                && isChildrenSumPropertyApplicable(node.left)
                && isChildrenSumPropertyApplicable(node.right);
    }

//    public Node<T> toDoublyLinkedList() {
//
//    }
//
//    private Node<T> toDoublyLinkedList(Node<T> node, Node<T> parent) {
//        if (node == null) return node;
//        Node<T> leftNode = toDoublyLinkedList(node.left, node);
//
//
//
//    }

    public static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node<T> left, Node<T> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
