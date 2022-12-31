package org.dsa;

public class PalindromeNumber {

    public static boolean isPalindrome(int number) {
        if (number >= 0 && number <= 9) return true;

        return number == reverse(number);
    }

    private static int reverse(int number) {
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse*10 + digit;
            number = number/10;
        }

        return reverse;
    }
}
