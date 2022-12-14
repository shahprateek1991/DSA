package org.dsa.math;

public class Power {

    public static long exponentRecursive(int x, int n) {
        long result = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                result = result*x;
            }
            n = n/2;
            x = x*x;
        }
        return result;
    }

    public static long exponentIterative(int x, int n) {
        if (n == 0) return 1;

        if (n%2 == 0) {
                long i = exponentRecursive(x, n/2);
                return i*i;
        } else {
            return exponentRecursive(x, n-1) * x;
        }
    }
}
