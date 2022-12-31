package org.dsa;

public class DigitCounter {

    public static int counter(int number) {
        if (number == 0) return 1;

        int count = 0;
        while (number > 0) {
            number = number/10;
            count++;
        }

        return count;
    }
}
