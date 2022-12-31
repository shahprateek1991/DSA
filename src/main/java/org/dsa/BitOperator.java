package org.dsa;

public class BitOperator {

    public static boolean isKthBitSet(int n, int k) {
        return (n >> k-1 & 1) != 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count = count + (n & 1);
            n= n/2;
        }
        return count;
    }

    public static int countSetBits_BrianKerningamAlgo(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public static int countSetBits_UsingLookupTable(int n) {
        int[] lookup = new int[256];
        for (int i=1; i<=255; i++) {
            lookup[i] = lookup[i & (i-1)] + 1;
        }

        return lookup[n & 255] +
                lookup[n>>8 & 255] +
                lookup[n>>16 & 255] +
                lookup[n>>24];
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }
}
