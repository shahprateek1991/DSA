package org.dsa;

import java.util.*;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

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

    public static int maxProfitInTrades(int[] arr) {
        int profit = 0;
        for (int i = 1; i<arr.length; i++) {
            if (arr[i-1] <= arr[i]) {
                profit = profit + (arr[i] - arr[i-1]);
            }
        }
        return profit;
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

    public static int maximumSumInCircularSubArray(int[] arr) {
        int result = arr[0];
        for (int i = 0; i< arr.length; i++) {
            int currentSum = arr[i];
            int currentMax = arr[i];
            for (int j =1; j<arr.length; j++) {
                int index = (i+j)%arr.length;
                currentSum = currentSum + arr[index];
                currentMax = Math.max(currentSum, currentMax);
            }
            result = Math.max(result, currentMax);
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

    public static int trapRainWater(int[] heights) {
        int result = 0;
        int[] leftMax = new int[heights.length];
        int[] rightMax = new int[heights.length];

        leftMax[0] = heights[0];
        for (int i = 1; i<heights.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], heights[i]);
        }

        rightMax[heights.length-1] = heights[heights.length-1];
        for (int i = heights.length-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], heights[i]);
        }

        for (int i = 1; i<heights.length-1; i++) {
            result = result + (Math.min(leftMax[i], rightMax[i])-heights[i]);
        }


        return result;
    }

    public static int majorityElement(int[] arr) {
        int count = 1;
        int currentMajorityElement = arr[0];
        for (int i = 1; i<arr.length; i++) {
            if (currentMajorityElement == arr[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                currentMajorityElement = arr[i];
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] == currentMajorityElement) {
                count++;
            }
            if (count > arr.length/2) return i;
        }
        return -1;
    }

    public static int equilibriumPoint(int[] arr) {
        int sum = 0;
        int sumLeft = 0;
        for (int j : arr) {
            sum = sum + j;
        }

        for (int j : arr) {
            sum = sum - j;
            if (sum == sumLeft) return j;

            sumLeft = sumLeft + j;

        }
        return -1;
    }

    public static int maxSumOfKConsecutiveElements(int[] arr, int k) {
        int currentSum = 0;
        for (int i = 0; i<k; i++) {
            currentSum = currentSum + arr[i];
        }
        int maxSum = currentSum;

        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum-arr[i-k]+arr[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void minimumConsecutiveFlips(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) {
                if (arr[i] != arr[0]) {
                    System.out.println();
                    System.out.print("From " + i + " to ");
                } else {
                    System.out.println(i-1);
                }
            }
        }

        if (arr[arr.length-1] != arr[0]) {
            System.out.println(arr.length-1);
        }

        System.out.println(">>>>>>>>>>>>> Finish <<<<<<<<<<<<<");

    }

    public static boolean subArrayWithGivenSum(int[] arr, int requiredSum) {
        int start = 0;
        int sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum = sum + arr[end];

            while (requiredSum < sum) {
                sum = sum - arr[start];
                start++;
            }

            if (sum == requiredSum) return true;
        }

        return false;

    }

    public static int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];
        res[0] = 1;
        for(int i = 1; i< nums.length; i++) {
            res[i] = res[i-1] * nums[i-1];
        }

        int runningMultiply = 1;

        for(int i = nums.length-1; i<=0; i--) {
            res[i] = res[i] * runningMultiply;
            runningMultiply = runningMultiply * nums[i];
        }

        return res;
    }



}
