package codeSignal;

public class AlphabetSubsequence {
	public static void main(String[] args){
		String s = "abcdefgih";
		
		for ( int i = 0; i < s.length() - 1; i++ ){
	        if ( s.charAt(i) >= s.charAt(i+1)){
	        	System.out.println("false");
	        	return;
	        }
	    }

		System.out.println("true");
	}
}
