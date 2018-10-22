package codeSignal;

public class AbsoluteValuesSumMinimization {
	public static void main(String[] args){
		int[] a = {2, 4, 7};
		int result = 0;
		int count = 0;
		int min = Integer.MAX_VALUE;
		
		for ( int i = 0; i < a.length; i++ ){
			for ( int j = 0; j < a.length; j++ ){
				count = count + Math.abs(a[j] - a[i]);
			}
			
			if ( count < min ){
				min = count;
				result = a[i];
			}
			count = 0;
		}
		
		// Just return a[(a.length-1)/2] WTF
		System.out.println(result);
	}
}
