package codeSignal;

import java.util.ArrayList;

public class AllLongestStrings {
	public static void main(String[] args){
		String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
		
		ArrayList<String> outputArray = new ArrayList<String>();
		
		int maxLength = 0;
		
		for ( int i = 0; i < inputArray.length; i++ ){
			if ( maxLength < inputArray[i].length()){
				maxLength = inputArray[i].length();
			}
		}
		
		for ( int i = 0; i < inputArray.length; i++ ){
			if ( inputArray[i].length() == maxLength){
				outputArray.add(inputArray[i]);
			}
		}
		
		String[] result = new String[outputArray.size()];
		
		for ( int i = 0; i < outputArray.size(); i++ ){
			result[i] = outputArray.get(i);
			System.out.println(result[i]);
		}
	}
}
