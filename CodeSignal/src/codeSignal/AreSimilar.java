package codeSignal;

import java.util.Arrays;

public class AreSimilar {
	public static void main(String[] args){
		int[] a = {1, 2, 2};
		int[] b = {2, 1, 1};
		
		int count = 0;
	    int firstIndex = 0;
	    int secondIndex = 0;
	    int temp;

	    for ( int i = 0; i < a.length; i++ ){
	        if(a[i] != b[i]){
	            if ( count == 0 )
	                firstIndex = i;

	            if ( count == 1 )
	                secondIndex = i;

	            count++;
	        }
	    }

	    if ( count > 2 ){
	        System.out.println("out");
	        return;
	    }else{
	        temp = a[firstIndex];
	        a[firstIndex] = a[secondIndex];
	        a[secondIndex] = temp;
	    }

	    if ( Arrays.equals(a, b)){
	        System.out.println("true");
	    } else {
	        System.out.println("false");
	    }
	}
}
