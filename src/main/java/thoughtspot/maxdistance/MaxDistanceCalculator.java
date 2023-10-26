package thoughtspot.maxdistance;

public class MaxDistanceCalculator {

    // You are given an array representing a row of seats where seats[i] = 1 represents a person sitting in the ith seat, and seats[i] = 0 represents that the ith seat is empty (0-indexed).
//  There is at least one empty seat, and at least one person sitting.

//  Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized.

//  Return that maximum distance to the closest person.

//Input: seats = [1,0,0,0,1,0,1]
//Output: 2

    public static int maxDistance(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        for(int i = 0; i< arr.length; i++) {
            if(arr[i] == 1) {
                left[i] = 0;
            } else {
                if(i == 0) {
                    left[i] = 0;
                }
                else {
                    left[i] = left[i-1] +1;
                }
            }
        }

        for(int i = arr.length -1; i >=0; i--) {
            if(arr[i] == 1) {
                right[i] = 0;
            } else {
                if(i == arr.length -1) {
                    right[i] = 0;
                }
                else {
                    right[i] = right[i+1] +1;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < arr.length; ++i)
            if (arr[i] == 0)
                ans = Math.max(ans, Math.min(left[i], right[i]));

        return ans;

    /*

    if(left[i] < right[i] && maxLeft < left[i]) {
            maxLeft = left[i];
            maxRight = right[i];
        } else if(left[i] > right[i] && maxRight < right[i]) {
            maxLeft = left[i];
            maxRight = right[i];
        } else if(left[i] == right[i]) {
            if(maxLeft > maxRight && maxRight < right[i]) {
                maxLeft = left[i];
                maxRight = right[i];
            } else {

            }

        }
    */


    }
}
