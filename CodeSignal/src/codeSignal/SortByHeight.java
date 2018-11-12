package codeSignal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByHeight {
	public static void main(String[] args){
		int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
		
		int count = 0;
		ArrayList<Integer> sortArray = new ArrayList<Integer>();
		
		for ( int i = 0; i < a.length; i++ ){
			if ( a[i] != -1 ){
				sortArray.add(a[i]);
			}
		}
		
		Ascending ascending = new Ascending();
		Collections.sort(sortArray, ascending);
		
		for ( int i = 0; i < a.length; i++ ){
			if ( a[i] != -1 ){
				a[i] = sortArray.get(count);
				count++;
			}
		}
    
		for ( int i = 0; i < a.length; i++ ){
			System.out.print(a[i] + " ");
		}
	}
}

class Ascending implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
	    return o1.compareTo(o2);
	}
}
