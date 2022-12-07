package org.dsa.math;

public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i=2; i<number; i++) {
            if (number % i ==0) return false;
        }
        return true;
    }

    public static boolean isPrimeUsingRootMethod(int number) {
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        for (int i=5; i<=Math.sqrt(number); i = i+6) {
            if (number % i ==0 || number % (i+2) == 0) return false;
        }
        return true;
    }
}
