package org.dsa.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        reverse(arr, 0, rotateFactor - 1);
        reverse(arr, rotateFactor, arr.length - 1);
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

    public static List<Integer> leaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int currentLeader = arr[arr.length-1];
        leaders.add(currentLeader);
        for (int i = arr.length-2; i>=0; i--) {
            if (arr[i] > currentLeader) {
                currentLeader = arr[i];
                leaders.add(arr[i]);
            }
        }
        return leaders;
    }

    public static int maximumDifference(int[] arr) {
        int minValue = arr[0];
        int difference = arr[1]-arr[0];

        for (int i = 1; i<arr.length; i++) {
            difference = Math.max(difference, arr[i]-minValue);
            minValue = Math.min(minValue, arr[i]);
        }

        return difference;
    }

    public static void frequencyInSortedArray(int[] arr) {
        for (int i = 0; i<arr.length;) {
            int count = 0;
            int currentElement = arr[i];
            while (i < arr.length && arr[i] == currentElement ) {
                count++;
                i++;
            }

            System.out.println(currentElement +" time " + count);
        }
    }

    public static int maxConsecutiveOnes(int[] arr) {
        int max = 0;
        for (int i = 0; i<arr.length;) {
            int currentCount = 0;
            while (i< arr.length && arr[i] == 1){
                currentCount++;
                i++;
            }

            max = Math.max(max, currentCount);
            i++;
        }

        return max;
    }

    public static int maximumSubArraySum(int[] arr) {
        int result = arr[0];
        int sumOfPrevSubArray = arr[0];
        for (int i = 1; i<arr.length; i++) {
            sumOfPrevSubArray = Math.max(sumOfPrevSubArray+arr[i], arr[i]);
            result = Math.max(result, sumOfPrevSubArray);
        }

        return result;
    }

    public static int maximumOddEvenPair(int[] arr) {
        int result = 1;
        int current = 1;
        for (int i = 1; i< arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i-1] % 2 !=0) ||
                    (arr[i-1] % 2 == 0 && arr[i] % 2 !=0)) {
                current++;
                result = Math.max(current, result);
            } else {
                current = 1;
            }
        }

        return result;
    }

}
