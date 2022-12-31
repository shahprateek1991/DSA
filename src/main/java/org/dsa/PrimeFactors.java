package org.dsa;

import java.util.LinkedList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> primeFactorsBruteForce(int number) {
        List<Integer> result = new LinkedList<>();
        int n = number;

        for (int i = 2; i<=Math.sqrt(n); i++) {
                while (number % i == 0) {
                    result.add(i);
                    number = number/i;
                }
        }
        if (number > 1) result.add(number);
        return result;
    }

    public static List<Integer> primeFactorsEfficient(int number) {
        List<Integer> result = new LinkedList<>();
        int n = number;

        while (number % 2 == 0) {
            result.add(2);
            number = number/2;
        }
        while (number % 3 == 0) {
            result.add(3);
            number = number/3;
        }
        for (int i = 5; i<=Math.sqrt(n); i = i+6) {
            while (number % i == 0) {
                result.add(i);
                number = number/i;
            }

            while (number % (i+2) == 0) {
                result.add(i+2);
                number = number/(i+2);
            }
        }
        if (number > 3) result.add(number);
        return result;
    }
}
