package codeSignal;

public class LongestDigitsPrefix {
	public static void main(String[] args){
		String inputString = "0123456789";
		String temp = "empty";
		
		int i = 0;
		
		try{
			while ( inputString.charAt(i) != ' '){
				Integer.parseInt(inputString.charAt(i) + "");
				i++;		
			}
		}catch(NumberFormatException e){
			temp = inputString.substring(0, i);
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e){
			temp = inputString.substring(0, i);
			e.printStackTrace();
		}
		
		System.out.println(temp);
	}
}
