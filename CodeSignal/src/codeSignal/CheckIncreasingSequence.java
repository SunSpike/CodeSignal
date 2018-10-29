package codeSignal;

public class CheckIncreasingSequence {
	public static void main(String[] args){
		int[] seq = { 1, 3, 8, 11 };
		
		for (int i = 1; i < seq.length; i++) {
		    if (seq[i] <= seq[i + 1]) {
		    	System.out.println("false");
		    	return;
		    }
		}
		
		System.out.println("true");
	}	
}
