package codeSignal;

public class AlmostIncreasingSequence {
	public static void main(String[] args){
		int[] sequence = {1, 3, 2, 1};
		
		for ( int i = 0; i < sequence.length - 2; i++ ){
			if(sequence[i] >= sequence[i+1]){
				System.out.println(sequence[i]);
				if ( sequence[i] >= sequence[i+2]){
					remove(i, sequence);
				}else{
					remove(i+1, sequence);
				}
				
				
				if(isSort(sequence)){
					System.out.println("possible");
					return;
				}else{
					System.out.println("impossible");
					return;
				}
			}
		}
		
		System.out.println("possible");
	}
	
	static boolean isSort(int[] array){
		for (int i = 0; i < array.length - 2; i++) {
	        if (array[i] >= array[i + 1]) {
	            return false; // It is proven that the array is not sorted.
	        }
	    }

	    return true; // If this part has been reached, the array must be sorted.
	}

	static void remove(int index, int[] array){
		for ( int i = index; i < array.length - 1; i++ ){
			array[i] = array[i+1];
		}
	}
}
