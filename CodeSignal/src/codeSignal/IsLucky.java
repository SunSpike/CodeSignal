package codeSignal;

public class IsLucky {
	public static void main(String[] args){
		int n = 1230;

		int n1Count = 0;
		int n2Count = 0;
		
		String numberString = Integer.toString(n);
		
		int numberLength = numberString.length();
		
		String n1String = numberString.substring(0, numberLength/2);
		String n2String = numberString.substring(numberLength/2, numberLength);

		for ( int i = 0; i < n1String.length(); i++ ){
			n1Count = n1Count + Integer.parseInt(n1String.charAt(i) + "");
		}
		
		for ( int i = 0; i < n2String.length(); i++ ){
			n2Count = n2Count + Integer.parseInt(n2String.charAt(i) + "");
		}
    
	    if ( n1Count == n2Count){
	        System.out.println("true");
	    }else{
	        System.out.println("false");
	    }
	}
}
