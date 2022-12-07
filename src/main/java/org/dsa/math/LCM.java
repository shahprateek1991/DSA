package org.dsa.math;

public class LCM {

    public static int lcm(int a, int b) {
        int max = Math.max(a, b);
        for (int i = max; i<=a*b; i++) {
            if (i % a == 0 && i % b == 0) return i;
        }
        return max;
    }

    public static int lcmUsingGCD(int a, int b) {
        return (a*b)/gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a%b);
    }
}
