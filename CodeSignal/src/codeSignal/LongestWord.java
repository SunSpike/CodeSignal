package codeSignal;

public class LongestWord {
	public static void main(String[] args){
		String text = "Ready, Steady, Go!";
		String[] array = text.split("[^a-zA-Z]");
		
		int max = 0;
		int index = 0;
		
		for( int i = 0; i < array.length; i++ ){
			if ( max < array[i].length() ){
				max = array[i].length();
				index = i;
			}
		}
		
		System.out.println(array[index]);
	}
}
