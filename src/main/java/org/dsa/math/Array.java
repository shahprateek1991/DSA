package org.dsa.math;

import java.util.Arrays;

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
        return reverse(arr, 0, arr.length-1);
    }

    public static int[] removeDuplicateFromSortedArray(int []arr) {
        int index = 1;
        for (int i = 1; i<arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                arr[index] = arr[i];
                index++;
            }
        }
        return Arrays.copyOf(arr, index);
    }

    public static int[] moveAllZerosToEnd(int []arr) {
        int index = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        return arr;
    }

    public static int[] rotateLeftArray(int []arr, int rotateFactor) {
        int[] newArr = new int[rotateFactor];
        System.arraycopy(arr, 0, newArr, 0, rotateFactor);
        for (int i = rotateFactor; i<arr.length; i++) {
            arr[i-rotateFactor] = arr[i];
        }
        int index = 0;
        for (int i = arr.length-rotateFactor; i<arr.length; i++) {
            arr[i] = newArr[index];
            index++;
        }
        return arr;
    }

    public static int[] rotateLeftArrayWithoutExtraSpace(int []arr, int rotateFactor) {
        arr = reverse(arr, 0, rotateFactor-1);
        arr = reverse(arr, rotateFactor, arr.length-1);
        return reverse(arr, 0, arr.length-1);
    }

    private static int[] reverse(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low]  = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

        return arr;
    }

}
