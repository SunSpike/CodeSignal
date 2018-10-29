package codeSignal;

public class IsTandemRepeat {
	public static void main(String[] args){
		String inputString = "asdfasdf";
		
		if ( inputString.substring(0, inputString.length() / 2).equals(inputString.substring(inputString.length() / 2, inputString.length())))
			System.out.println("true");
	    else
	        System.out.println("false");
	}
}
