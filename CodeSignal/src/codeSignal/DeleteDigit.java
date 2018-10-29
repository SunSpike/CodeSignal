package codeSignal;

public class DeleteDigit {
	public static void main(String[] args){
		int n = 231259;
		int max = 0;
	    String s = Integer.toString(n);
	    String temp = "";

	    for (int i = 0; i < s.length(); i++ ){
	        temp = s.substring(0, i) + s.substring(i+1, s.length());
	        if ( max < Integer.parseInt(temp))
	            max = Integer.parseInt(temp);
	    }

	    System.out.println(max);
	}
}
