package codeSignal;

public class DigitsProduct {
	public static void main(String[] args){
		int product = 117;
		int count = 0;
		
		String result = "";
		
		if ( product == 0 )
			System.out.println("10");
		
		if ( product == 1 )
			System.out.println("1");
		
		while ( product != 1 ){
			for ( int i = 9; i > 0; i-- ){
				if ( i == 1 ){
					count++;
					break;
				}
				if ( product % i == 0 ){
					result = result + i;
					product = product / i;
					break;
				}
			}
			if ( count > 1 ){
				break;
			}
		}
		
		if ( result.equals("") ){
			result = "-1";
			result = new StringBuilder(result).reverse().toString();
		}else if(product > 9){
			result = "-1";
			result = new StringBuilder(result).reverse().toString();
		}
			
		
		result = new StringBuilder(result).reverse().toString();
		System.out.println(result);
	}
}
