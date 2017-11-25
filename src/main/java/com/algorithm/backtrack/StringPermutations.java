package com.algorithm.backtrack;

public class StringPermutations {
	public static void generateAllStringPermutations(int lengthOfString, char[] inputSource, char[] outputString) {
		if(lengthOfString < 0) {
			System.out.println(String.copyValueOf(outputString));
			return;
		} else {
			for(int i =0; i< inputSource.length; i++) {
				outputString[i] = inputSource[i];
				generateAllStringPermutations(lengthOfString-1, inputSource, outputString);
			}
		}
	}

}
