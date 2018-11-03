package codeSignal;

public class ShapeArea {

	public static void main(String[] args) {
		int n = 4;
		int result = 1;
		
		for ( int i = 1; i < n; i++ ){
			result = result + (4 * i);
		}
		
		System.out.println(result);
	}

}
