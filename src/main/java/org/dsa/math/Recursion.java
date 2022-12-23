package org.dsa.math;

public class Recursion {

    public static void printReversedNaturalNumbers(int n) {
        if (n == 0) return;
        System.out.println(n);
        printReversedNaturalNumbers(n-1);
    }

    public static void printNaturalNumbers(int n) {
        if (n == 0) return;
        printNaturalNumbers(n-1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }

}
