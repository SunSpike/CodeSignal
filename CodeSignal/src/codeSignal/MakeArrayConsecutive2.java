package codeSignal;

import java.util.Arrays;

public class MakeArrayConsecutive2 {
	public static void main(String[] args){
		int[] statues = {6, 2, 3, 8};
		int min, max;
		int count = 0;
		min = statues[0];
		max = statues[0];
		
		for ( int i = 0; i < statues.length; i++ ){
	        if ( statues[i] < min )
	            min = statues[i];
	        
	        if ( statues[i] > max )
	            max = statues[i];
	    }
	    
	    Arrays.sort(statues);

	    count = (max - min + 1) - statues.length;
	    
	    System.out.println(count);
	}
}
