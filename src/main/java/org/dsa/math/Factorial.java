package org.dsa.math;

public class Factorial {

    public static int factorial(int n) {
        if (n ==0) return 1;

        int result = 1;
        for (int i=1; i<=n; i++) {
            result = result * i;
        }

        return result;
    }

    public static int factorialRecursive(int n) {
        if (n== 0) return 1;
        return n * factorialRecursive(n-1);
    }

    public static int trailingZeroInFactorial(int number) {
        int count = 0;
        for (int i = 5; i <= number; i = i * 5) {
            count = count + (number/i);
        }
        return count;
    }
}
