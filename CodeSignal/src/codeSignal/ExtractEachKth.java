package codeSignal;

import java.util.ArrayList;

public class ExtractEachKth {
	public static void main(String[] args){
		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 3;
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for ( int i = 0; i < inputArray.length; i++ ){
			if ( (i + 1) % k != 0 )
				arrayList.add(inputArray[i]);
		}
		
		int[] result = new int[arrayList.size()];
		
		for ( int i = 0; i < result.length; i++ ){
			result[i] = arrayList.get(i);
			System.out.print(result[i] + " ");
		}
	}
}
