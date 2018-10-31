package codeSignal;

public class LineEncoding {
	public static void main(String[] args){
		String s = "aabbbcccd";
		String result = "";
		
		int count = 1;
		
		for ( int i = 0; i < s.length() - 1; i++ ){
			if ( s.charAt(i) == s.charAt(i+1) ){
				count++;
				System.out.println("count++");
			}	
			
			else{
				if ( count == 1 )
					result = result + s.charAt(i);
				
				else
					result = result + Integer.toString(count) + s.charAt(i);
				
				count = 1;
			}
		}
		
		if ( count > 1 )
			result = result + Integer.toString(count) + s.charAt(s.length() - 1);
		else
			result = result + s.charAt(s.length() - 1);
		
		System.out.println(result);
	}
}
