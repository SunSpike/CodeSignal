package codeSignal;

public class ArrayMaxConsecutiveSum {
	public static void main(String[] args){
		int[] inputArray = {2, 3, 5, 1, 6};
		int k = 3;
		int max = 0;
		int temp = 0;
		
		for ( int i = 0; i < inputArray.length - k+1; i++ ){
			
			for ( int j = 0; j < k; j++ ){
				temp = temp + inputArray[i+j];
			}
			if ( max < temp )
				max = temp;
			
			temp = 0;
		}
		
		System.out.println(max);
	}
}
