package codeSignal;

public class MineSweeper {
	public static void main(String[] args){
		boolean[][] matrix = {{true , false, false},
							  {false, true , false},
							  {false, false, false}};
		
		int[][] result = new int[matrix.length][matrix[0].length];
		int count = 0;
		
		for ( int i = 0; i < result.length; i++ ){
			for ( int j = 0; j < result[i].length; j++ ){
				System.out.println(result[i][j]);
			}
		}
		
		System.out.println("github testing now..");
	}
}
