package codeSignal;

public class SumUpNumbers {
	public static void main(String[] args){
		String inputString = "2 apples, 12 oranges";
		String[] array = inputString.split("[^0-9]");
		int total = 0;
		
		for ( int i = 0; i < array.length; i++ ){
			if ( !array[i].equals("") )
				total = total + Integer.parseInt(array[i]);
		}
		System.out.println(total);
	}
}
