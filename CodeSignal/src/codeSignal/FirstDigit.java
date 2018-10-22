package codeSignal;

public class FirstDigit {
	public static void main(String[] args){
		String inputString = "var_1__Int";
		char result = '1';
		int resultInt = -1;
		for ( int i = 0; i < inputString.length(); i++ ){
			try{
				resultInt = Integer.parseInt(inputString.charAt(i) + "");
				result = inputString.charAt(i);
			}catch(NumberFormatException e){
				resultInt = -1;
				e.printStackTrace();
			}
				
			if ( resultInt != -1 ){
				System.out.println(result);
				return;
			}
		}
	}
}
