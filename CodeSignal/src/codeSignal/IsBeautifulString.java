package codeSignal;

public class IsBeautifulString {
	public static void main(String[] args){
		String inputString = "bbbaacdafe";
		int[] array = new int[26];
		
		for ( int i = 0; i < array.length; i++ ){
			array[i] = 0;
		}
		for ( int i = 0; i < inputString.length(); i++ ){
			array[inputString.charAt(i)-97]++;
		}
		
		for ( int i = 0; i < array.length; i++ ){
			System.out.println(array[i]);
		}
		for ( int i = 0; i < array.length - 1; i++ ){
			if(array[i+1] <= array[i]){
				continue;
			}else{
				System.out.println("false");
				return;
			}
		}
		
		
		System.out.println("true");
	}
}
