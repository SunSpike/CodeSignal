package codeSignal;

public class ArrayChange {
	public static void main(String[] args){
		int[] inputArray = {1, 1, 1};
		int count = 0;
	    int temp = 0;

	    for ( int i = 0; i < inputArray.length-1; i++ ){
	        if (inputArray[i+1] <= inputArray[i]){
	            temp = inputArray[i+1];
	            inputArray[i+1] = inputArray[i]+1;
	            count = count + (inputArray[i+1] - temp);
	        }
	    }

	    System.out.println(count);
	}
}
