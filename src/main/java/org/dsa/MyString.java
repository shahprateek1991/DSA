package org.dsa;

import java.util.Arrays;

public class MyString {

    public static boolean isSubSequence(String s1, String s2){
        int i = 0, j = 0;
        while (i< s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s2.length();
    }

    public static boolean isSubSequenceRecursive(String s1, String s2){
        if (s2.length() == 0) return true;
        if (s1.length() == 0) return false;
        if (s1.charAt(0) == s2.charAt(0)) {
            return isSubSequenceRecursive(s1.substring(1), s2.substring(1));
        } else {
            return isSubSequenceRecursive(s1.substring(1), s2);
        }
    }

    public static int leftMostRepeatingCharacter(String s) {
        int[] count = new int[256];
        Arrays.fill(count, -1);
        int result = Integer.MAX_VALUE;

        for (int i = 0; i<s.length(); i++) {
            char character = s.charAt(i);
            if (count[character] == -1) {
                count[character] = i;
            } else {
                result = Math.min(result, count[character]);
                count[character] = Math.min(count[character], i);
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
    public static int leftMostNonRepeatingCharacter(String s) {
        int[] count = new int[256];
        Arrays.fill(count, -1);
        int result = Integer.MAX_VALUE;

        for (int i = s.length()-1; i>=0; i--) {
            char character = s.charAt(i);
            if (count[character] == -1) {
                count[character] = i;
                result = i;
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }


    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int lastWordStart  = 0;
        for (int i = 0; i<= arr.length; i++) {
            if (i == arr.length || arr[i] == ' ') {
                int low = lastWordStart;
                int high = i-1;
                while (low < high) {
                    char temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;
                    low++;
                    high--;
                }

                lastWordStart = i+1;
            }
        }

        return new String(arr);
    }
}
