package codeSignal;

public class AlternatingSums {
	public static void main(String[] args){
		int[] a = {50, 60, 60, 45, 70};
		int[] array = new int[2];
		
	    for ( int i = 0; i < a.length; i++ ){
	        if( i % 2 == 0 ){
	            array[0] = array[0] + a[i];
	        }else{
	            array[1] = array[1] + a[i];
	        }
	    }
	    
	    for ( int i = 0; i < array.length; i++ ){
	    	System.out.print(array[i] + " ");
	    }
	}
}
