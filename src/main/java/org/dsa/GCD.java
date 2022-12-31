package org.dsa;

public class GCD {

    public static int gcdNaive(int a, int b) {
        int gcd = Math.min(a, b);

        while (gcd > 0) {
            if (a%gcd == 0 && b%gcd == 0) break;
            gcd--;
        }

        return gcd;
    }

    public static int euclideanGCD(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a-b;
            else
                b = b-a;
        }
        return a;
    }

    public static int euclideanOptimizedGCD(int a, int b) {
        if (b == 0) return a;
        else return euclideanOptimizedGCD(b, a%b);
    }
}
