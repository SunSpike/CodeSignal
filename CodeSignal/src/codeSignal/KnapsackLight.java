package codeSignal;

public class KnapsackLight {
	public static void main(String[] args){
		int value1 = 10;
		int weight1 = 5;
		int value2 = 6;
		int weight2 = 4;
		int maxW = 8;
		
		if ( maxW >= weight1 + weight2 )
			System.out.println(value1 + value2);
		if ( value1 >= value2 && maxW >= weight1 )
			System.out.println(value1);
		else if ( value2 >= value1 && maxW >= weight2 )
			System.out.println(value2);
		else if ( maxW >= weight1 )
			System.out.println(value1);
		else if ( maxW >= weight2 )
			System.out.println(value2);
		else
			System.out.println(0);
	}
}
