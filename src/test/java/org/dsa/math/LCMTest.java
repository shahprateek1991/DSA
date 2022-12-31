package org.dsa.math;

import org.dsa.LCM;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCMTest {

    @Test
    void shouldReturnLCMOfTwoNumbers_usingNaiveMethod() {
        assertEquals(21, LCM.lcm(7, 3));
        assertEquals(12, LCM.lcm(4, 3));
        assertEquals(4, LCM.lcm(4, 4));
    }

    @Test
    void shouldReturnLCMOfTwoNumbers_usingLCMMethod() {
        assertEquals(21, LCM.lcmUsingGCD(7, 3));
        assertEquals(12, LCM.lcmUsingGCD(4, 3));
        assertEquals(4, LCM.lcmUsingGCD(4, 4));
    }
}