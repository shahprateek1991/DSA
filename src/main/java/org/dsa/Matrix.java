package org.dsa;

import java.util.ArrayList;
import java.util.List;

public class Matrix {

    public static List<Integer> snakeTraversal(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    result.add(arr[i][j]);
                }
            } else {
                for (int j = arr[i].length-1; j >=0; j--) {
                    result.add(arr[i][j]);
                }
            }
        }

        return result;
    }
}
