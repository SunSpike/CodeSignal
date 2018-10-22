package codeSignal;

import java.util.Arrays;

public class StringsRearrangement {
	public static void main(String[] args){
		String[] inputArray = {"abc", "abx", "axx", "abx", "abc"};
		int count = 0;
		Arrays.sort(inputArray);
		for ( int i = 0; i < inputArray.length-1; i++){
			for ( int j = 0; j < inputArray[i].length(); j++ ){
				if ( inputArray[i].charAt(j) != inputArray[i+1].charAt(j) ){
					count++;
				}
			}
			if ( count > 1 ){
				System.out.println("false");
				return;
			}
			count = 0;
		}
		System.out.println("true");
		
		//Retired, Passed TestCase 17/21
	}
}
