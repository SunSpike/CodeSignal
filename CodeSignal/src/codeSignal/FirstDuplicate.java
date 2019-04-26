package codeSignal;

import java.util.Arrays;

public class FirstDuplicate {
	public static void main(String[] args){
		Integer[] array = {2, 1, 3, 5, 3, 2};
		Integer[] result = new Integer[array.length];
		
		for ( int i = 0; i < array.length; i++ ){
			if(Arrays.asList(result).contains(array[i])){
				System.out.println(array[i]);
				return;
			}
			result[i] = array[i];
		}
	}
}
