package codeSignal;

public class CircleOfNumbers {
	public static void main(String[] args){
		int n = 10;
		int firstNumber = 2;
		
		firstNumber = firstNumber + (n/2);
		if ( firstNumber >= n )
			firstNumber = firstNumber - n;
		
		System.out.println(firstNumber);
	}
}
