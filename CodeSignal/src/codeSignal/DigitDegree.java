package codeSignal;

public class DigitDegree {
	public static void main(String[] args){
		int n = 91;
		int count = 0;
		int temp = 0;
		
		String tempString = Integer.toString(n);
		
		while ( tempString.length() != 1 ){
			for ( int i = 0; i < tempString.length(); i++ ){
				temp = temp + Integer.parseInt(tempString.charAt(i) + "");
			}
			
			tempString = Integer.toString(temp);
			temp = 0;
			count++;
		}
		
		System.out.println(count);
	}
}
