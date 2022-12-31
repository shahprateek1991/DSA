package org.dsa;

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

    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) return 1;

        return n + sumOfNaturalNumbers(n-1);
    }

    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) return true;

        return str.charAt(0) == str.charAt(str.length() -1)
                && isPalindrome(str.substring(1, str.length()-1));
    }

    public static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return (n%10) + sumOfDigits(n/10);
    }

    public static int maximumCutForRope(int n, int a, int b, int c) {

        if (n == 0) return 0;
        if (n < 0) return -1;
        int result = Math.max(Math.max(maximumCutForRope(n-a, a, b, c),
                        maximumCutForRope(n-b, a, b, c)),
                maximumCutForRope(n-c, a, b, c));

        if (result == -1) return -1;
        return result+1;
    }

    public static void towerOfHanoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move 1 from " + a + " to " + c);
            return;
        }

        towerOfHanoi(n-1, a, c, b);
        System.out.println("Move "+ n +" from " + a + " to " + c);
        towerOfHanoi(n-1, b,a,c);
    }

}
