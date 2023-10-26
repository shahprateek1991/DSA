package org.dsa;

public class DynamicProgramming {

    public static int coinChange(int[] arr, int n, int target) {
        if (target == 0) return 1;
        if (target < 0) return 0;
        if (n ==0) return 0;

        return coinChange(arr, n, target-arr[n-1])
                + coinChange(arr, n-1, target);
    }
}
