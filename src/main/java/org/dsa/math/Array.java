package org.dsa.math;

public class Array {

    public static int findSecondLargestElementIndex(int []arr) {
        int largestElementIndex = 0;
        int secondLargestIndex = -1;

        for (int i = 0; i< arr.length; i++) {
            if (arr[i] > arr[largestElementIndex]) {
                secondLargestIndex = largestElementIndex;
                largestElementIndex = i;
            } else if (arr[i] != arr[largestElementIndex]){
                if (secondLargestIndex == -1 || arr[i] > arr[secondLargestIndex]) {
                    secondLargestIndex = i;
                }
            }
        }

        return secondLargestIndex;
    }

    public static boolean isArraySortedInAscendingOrder(int []arr) {
        for (int i = 1; i<arr.length; i++) {
            if (arr[i-1] > arr[i]) return false;
        }
        return true;
    }

    public static int[] reverse(int []arr) {
        for (int i = 0; i<arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        return arr;
    }

}
