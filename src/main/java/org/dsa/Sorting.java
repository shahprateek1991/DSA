package org.dsa;

public class Sorting {

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i< arr.length-1; i++) {
            boolean swapped = false;
            for (int j = 0; j< arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j< arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i< arr.length; i++) {
            int currentElement = arr[i];
            int j = i-1;
            while (j>=0 && currentElement < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentElement;
        }

        return arr;
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {

        return merge(arr1, arr2);
    }

    public static int[] mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
        return arr;
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left+((right-left)/2);
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] leftArr = new int[mid-left+1];
        int[] rightArr = new int[right-mid];
        for(int i=0;i<leftArr.length;i++)
            leftArr[i]=arr[i+left];
        for(int j=0;j<rightArr.length;j++)
            rightArr[j]=arr[mid+1+j];
        merge(leftArr, rightArr);
        
    }

    private static int[] merge (int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, index = 0;
        while (i< arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[index] = arr1[i];
                i++;
            } else {
                result[index] = arr2[j];
                j++;
            }
            index++;
        }

        while (i < arr1.length) {
            result[index] = arr1[i];
            i++;
            index++;
        }

        while (j < arr2.length) {
            result[index] = arr2[j];
            j++;
            index++;
        }

        return result;
    }
}
