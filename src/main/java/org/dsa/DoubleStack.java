package org.dsa;

public class DoubleStack {

    private int[] arr;
    private int top1, top2;

    public DoubleStack(int capacity) {
        arr = new int[capacity];
        top1 = -1;
        top2 = capacity;
    }

    public boolean push1(int element) {
        if (top1+1 == top2) return false;
        top1++;
        arr[top1] = element;
        return true;
    }

    public boolean push2(int element) {
        if (top1 == top2-1) return false;
        top2--;
        arr[top2] = element;
        return true;
    }

    public int pop1() {
        if (top1 == -1) return -1;
        int result = arr[top1];
        top1--;
        return result;
    }

    public int pop2() {
        if (top2 == arr.length) return -1;
        int result = arr[top2];
        top2++;
        return result;
    }
}
