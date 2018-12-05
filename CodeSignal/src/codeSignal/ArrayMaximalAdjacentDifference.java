package codeSignal;

public class ArrayMaximalAdjacentDifference {
	public static void main(String[] args){
		int[] inputArray = {2, 4, 1, 0};
		int max = 0;
		
	    for ( int i = 0; i < inputArray.length - 1; i++ ){
	        if ( max < Math.abs(inputArray[i] - inputArray[i+1])){
	            max = Math.abs(inputArray[i] - inputArray[i+1]);
	        }
	    }
	    
	    System.out.println(max);
	}
}
