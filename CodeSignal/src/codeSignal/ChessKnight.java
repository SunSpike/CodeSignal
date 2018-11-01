package codeSignal;

public class ChessKnight {
	public static void main(String[] args){
		String cell = "a1";
		int count = 0;
		
		char alpha = cell.charAt(0);
		char number = cell.charAt(1);
		
		if (alpha - 1 >= 'a' && alpha - 1 <= 'h'
				&& number - 2 >= '1' && number - 2 <= '8')
			count++;
		
		if (alpha - 2 >= 'a' && alpha - 2 <= 'h'
				&& number - 1 >= '1' && number - 1 <= '8')
			count++;
		
		if (alpha - 2 >= 'a' && alpha - 2 <= 'h'
				&& number + 1 >= '1' && number + 1 <= '8')
			count++;
		
		if (alpha - 1 >= 'a' && alpha - 1 <= 'h'
				&& number + 2 >= '1' && number + 2 <= '8')
			count++;
		
		if (alpha + 1 >= 'a' && alpha + 1 <= 'h'
				&& number + 2 >= '1' && number + 2 <= '8')
			count++;
		
		if (alpha + 2 >= 'a' && alpha + 2 <= 'h'
				&& number + 1 >= '1' && number + 1 <= '8')
			count++;
		
		if (alpha + 2 >= 'a' && alpha + 2 <= 'h'
				&& number - 1 >= '1' && number - 1 <= '8')
			count++;
		
		if (alpha + 1 >= 'a' && alpha + 1 <= 'h'
				&& number - 2 >= '1' && number - 2 <= '8')
			count++;
		
		System.out.println(count);
	}
}
