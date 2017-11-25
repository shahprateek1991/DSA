package com.algorithm.backtrack;

import org.junit.Test;

public class StringPermutationsUnitTest {
    
    @Test
    public void shouldGeneratePermutationOfCharactersGivenLenghtAndSorceOfString() {
        int lengthOfString = 4;
        char[] inputSource = "abcd".toCharArray();
        char[] outputString = new char[lengthOfString];

        StringPermutations.generateAllStringPermutations(lengthOfString-1, inputSource, outputString);
    }

}