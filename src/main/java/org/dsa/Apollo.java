package org.dsa;

import java.util.*;

class Apollo {

    public static String MinWindowSubstring(String[] strArr) {
        // code goes here
        String minString = strArr[1];
        String windowString = strArr[0];
        String result = "";
        int resultLength = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();
        for (Character c : minString.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;

        while (left <= right && right < windowString.length()) {


            Character cRight = windowString.charAt(right);
            if (map.containsKey(cRight) && map.get(cRight) > windowMap.getOrDefault(cRight, 0)) {
                windowMap.put(cRight, windowMap.getOrDefault(cRight, 0) + 1);
                if (map.size() == windowMap.size()) {
                    int len = right - left + 1;
                    if (len < resultLength) {
                        result = windowString.substring(left, right + 1);
                    }
                }
                right++;
            } else if (map.containsKey(cRight) && windowMap.containsKey(cRight) && map.get(cRight) >= windowMap.get(cRight)) {
                Character cLeft = windowString.charAt(left);
                if (windowMap.containsKey(cLeft)) {
                    if (windowMap.get(cLeft) == 1) {
                        windowMap.remove(cLeft);
                    } else {
                        windowMap.put(cLeft, windowMap.get(cLeft) - 1);
                    }
                }
                left++;


                if (map.size() == windowMap.size()) {
                    int len = right - left + 1;
                    if (len < resultLength) {
                        result = windowString.substring(left, right + 1);
                    }
                }
            } else {
                right++;
            }


        }
        return result;
    }

}