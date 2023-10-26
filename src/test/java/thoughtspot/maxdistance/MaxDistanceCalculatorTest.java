package thoughtspot.maxdistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDistanceCalculatorTest {

    @Test
    void name() {
        System.out.println(MaxDistanceCalculator.maxDistance(new int[] {1,0,0,0,0,0,1}));
        System.out.println(MaxDistanceCalculator.maxDistance(new int[] {1,0,0,0,1,0,1}));
    }
}