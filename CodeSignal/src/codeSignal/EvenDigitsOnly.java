package codeSignal;

public class EvenDigitsOnly {
	public static void main(String[] args){
		int n = 248622;
		String temp = Integer.toString(n);
		
		for ( int i = 0; i < temp.length(); i++ ){
			if ( Integer.parseInt(temp.charAt(i) + "") % 2 != 0 )
				System.out.println("false");
		}
		System.out.println("true");
	}
}
