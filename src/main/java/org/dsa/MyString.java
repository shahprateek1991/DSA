package org.dsa;

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
}
