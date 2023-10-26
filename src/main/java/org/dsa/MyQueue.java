package org.dsa;

public class MyQueue<T> {

    private int[] data;
    int size, front, rear;

    public MyQueue(int capacity) {
        rear = -1;
        data = new int[capacity];
    }

    public void enqueue(int element) {
        rear = (rear+1) % data.length;
    }
}
