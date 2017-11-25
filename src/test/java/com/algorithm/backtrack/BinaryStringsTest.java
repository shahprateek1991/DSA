package com.algorithm.backtrack;

import org.junit.Test;


public class BinaryStringsTest {

    @Test
    public void generateAllBinaryPermutationsGivenLengthOfString() {
        int sizeOfString = 4;
        char[] data = new char[sizeOfString];
        BinaryStrings.generateAllBinaryPermutations(sizeOfString-1, data);
    }

}