package codeSignal;

public class ArrayReplace {
	public static void main(String[] args){
		int[] inputArray = {1, 2, 1};
		int elemToReplace = 1;
		int substitutionElem = 3;
		
		for ( int i = 0; i < inputArray.length; i++ ){
			if ( inputArray[i] == elemToReplace ){
				inputArray[i] = substitutionElem;
			}
		}
	}
}
