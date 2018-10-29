package codeSignal;

public class MatrixTransposition {
	public static void main(String[] args){
		int[][] matrix = {{1, 1, 3},
						  {2, 1, 1}};
		int[][] result = new int[matrix[0].length][matrix.length];
		
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				result[i][j] = matrix[j][i];
		    }
		}

		for ( int i = 0; i < result.length; i++ ){
			for ( int j = 0; j < result[0].length; j++ ){
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
