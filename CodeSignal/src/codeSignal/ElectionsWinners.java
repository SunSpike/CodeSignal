package codeSignal;

import java.util.Arrays;

public class ElectionsWinners {
	public static void main(String[] args){
		int[] votes = {2, 3, 5, 2};
		int k = 3;
		
		Arrays.sort(votes);
		
	    int max = votes[votes.length - 1];
	    int count = 0;
	    int countMax = 0;

	    for ( int i = 0; i < votes.length; i++ ){
	        if ( votes[i] == max )
	            countMax++;
	    }

	    for ( int i = 0; i < votes.length; i++ ){
	        if ( votes[i] + k > max)
	            count++;
	    }

	    if ( countMax == 1 && count == 0)
	        count++;
		
		System.out.println(count);
	}
}
