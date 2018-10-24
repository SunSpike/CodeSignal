package codeSignal;

public class BishopAndPawn {
	public static void main(String[] args){
		String bishop = "a1";
		String pawn = "c3";
		
		char bishopAlpha = bishop.charAt(0);
		char pawnAlpha = pawn.charAt(0);
		char bishopNum = bishop.charAt(1);
		char pawnNum = pawn.charAt(1);

		if ( Math.abs(bishopAlpha - pawnAlpha) == Math.abs(bishopNum - pawnNum)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}
