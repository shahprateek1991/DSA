package com.algorithm.backtrack;

public class BinaryStrings {

	public static void generateAllBinaryPermutations(int lengthOfString, char[] outputString) {
		if(lengthOfString < 0) {
			System.out.println(String.copyValueOf(outputString));
			return;
		} else {
			outputString[lengthOfString] = '0';
			generateAllBinaryPermutations(lengthOfString-1, outputString);
			
			outputString[lengthOfString] = '1';
			generateAllBinaryPermutations(lengthOfString-1, outputString);
		}
	}

}
