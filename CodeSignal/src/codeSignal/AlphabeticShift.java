package codeSignal;

public class AlphabeticShift {
	public static void main(String[] args){
		String inputString = "crazy";
		String result = "";
		char temp;
		
		for ( int i = 0; i < inputString.length(); i++ ){
			temp = (char)(inputString.charAt(i) + 1);
			if ( temp > 122 )
				temp = (char)(temp - 26);
			
			result = result + temp;
		}
		
		System.out.println(result);
	}
}
