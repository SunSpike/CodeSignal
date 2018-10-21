package codeSignal;

public class ChessBoardCellColor {
	public static void main(String[] args){
		String cell1 = "A1";
		String cell2 = "B2";
		
		int char1 = cell1.charAt(0);
		int char2 = cell2.charAt(0);
		
		int num1 = cell1.charAt(1);
		int num2 = cell2.charAt(1);
		
		int result1 = 0;
		int result2 = 0;
		
		if ( char1 % 2 != 0 )
			result1 = result1 + 1;
		
		if ( char2 % 2 != 0 )
			result2 = result2 + 1;
		
		if ( num1 % 2 != 0 )
			result1 = result1 + 1;
		
		if ( num2 % 2 != 0 )
			result2 = result2 + 1;
		
		if ( result1 % 2 == result2 % 2)
			System.out.println(true);
		else
			System.out.println(false);
	}
}
