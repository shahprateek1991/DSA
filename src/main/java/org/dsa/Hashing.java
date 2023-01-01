package org.dsa;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hashing {

    public static boolean doesPairExist(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();
        for (int a: arr) {
            set.add(a);
        }

        for (int a: arr) {
            if (set.contains(sum-a) && sum-a != a) return true;
        }

        return false;
    }

    public static boolean subArrayWithZeroSum(int[] arr) {
        return false;
    }
}
