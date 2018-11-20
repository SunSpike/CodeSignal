package codeSignal;

public class PalindromeRearranging {
	public static void main(String[] args){
		String inputString = "aabb";
		
		int[] array = new int[26];
	    int count = 0;

	    for ( int i = 0; i < inputString.length(); i++ ){
	        array[(int)inputString.charAt(i)-97]++;
	    }

	    for ( int i = 0; i < 26; i++ ){
	        if(array[i] % 2 != 0){
	            count++;
	        }
	    }

	    if ( count > 1 ){
	    	System.out.println("false");
	    }else{
	        System.out.println("true");
	    }
	}
}
