package codeSignal;

public class CheckPalindrome {
	public static void main(String[] args){
		String inputString = "aabaa";
		String reverse = new StringBuilder(inputString).reverse().toString();
		
		if ( inputString.equals(reverse) )
			System.out.println("true");
		else
			System.out.println("false");
	}
}
