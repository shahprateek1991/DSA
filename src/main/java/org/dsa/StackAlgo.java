package org.dsa;

import java.util.Stack;

public class StackAlgo {

    public static int[] previousGreaterElement(int[] arr) {
        Stack<Integer> maxElementChain = new Stack<>();
        int[] results = new int[arr.length];
        for (int i = 0; i< arr.length; i++) {
            while (!maxElementChain.isEmpty() && maxElementChain.peek() < arr[i]) {
                maxElementChain.pop();
            }

            results[i] = maxElementChain.isEmpty() ? -1 : maxElementChain.peek();
            maxElementChain.push(arr[i]);
        }
        return results;
    }

    public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> maxElementChain = new Stack<>();
        int[] results = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            while (!maxElementChain.isEmpty() && maxElementChain.peek() < arr[i]) {
                maxElementChain.pop();
            }

            results[i] = maxElementChain.isEmpty() ? -1 : maxElementChain.peek();
            maxElementChain.push(arr[i]);
        }
        return results;
    }
}
