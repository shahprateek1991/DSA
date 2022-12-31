package org.dsa;

public class Search {

    public static int binarySearch(int[] arr, int element) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int index = (low+high)/2;
            if (element == arr[index]) return index;
            if (element > arr[index]) low = index+1;
            else high = index-1;
        }

        return -1;
    }
}
