package codeSignal;

public class RightmostRoundNumber {
	public static void main(String[] args){
		int[] inputArray = {0, 5, 10, 15};
		int result = -1;
		
	    for ( int i = 0; i < inputArray.length; i++ ){
	        if ( Integer.toString(inputArray[i]).charAt(Integer.toString(inputArray[i]).length() - 1) == '0' ){
	            result = i;
	        }
	    }

	    System.out.println(result);
	}
}
