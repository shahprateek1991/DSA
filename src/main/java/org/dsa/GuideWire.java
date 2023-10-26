package org.dsa;

import java.util.ArrayList;
import java.util.List;

public class GuideWire {

    public static int solution(int A) {
        List<Integer> digits = new ArrayList<>();

        int result = 0;

        while(A != A%10) {
            digits.add(A%10);
            A= A/10;
        }

        digits.add(A);

        while(digits.size() != 0) {
            result = result *10 + digits.get(digits.size()-1);
            digits.remove(digits.size()-1);

            if(digits.size() !=0 ) {
                result = result *10 + digits.get(0);
                digits.remove(0);
            }
        }

        return result;
    }


    public static int domino(int[] A) {
        if(A.length <=2) return 0;

        int result = Integer.MAX_VALUE;

        for(int i = 0; i < A.length-1; i = i+2) {
            int previousEndDomino = A[i+1];
            int tileToBeRemoved = i/2;
            for(int j = i+2; j < A.length-1; j = j+2) {
                if(A[j] == previousEndDomino) {
                    previousEndDomino = A[j+1];
                } else {
                    tileToBeRemoved++;
                }

            }

            result = Math.min(result, tileToBeRemoved);

        }


        return result;
    }
}
