package codeSignal;

public class MessageFromBinary {
	public static void main(String[] args){
		String code = "010010000110010101101100011011000110111100100001";
		String result = "";
		int temp;
		
		for ( int i = 0; i < code.length() / 8; i++ ){
			temp = Integer.parseInt(code.substring(i*8, i*8+8), 2);
			result = result + (char)temp;
		}
		
		System.out.println(result);
	}
}
