package codeSignal;

public class DifferentSymbolsNaive {
	public static void main(String[] args){
		String s = "cabca";
		
		int[] a = new int[26];
		int count = 0;
		
		for ( int i = 0; i < s.length(); i++ ){
			a[s.charAt(i)-97]++;
		}
		
		for ( int i = 0; i < a.length; i++ ){
			if ( a[i] != 0 ){
				count++;
			}
		}
		
		System.out.println(count);
	}
}
