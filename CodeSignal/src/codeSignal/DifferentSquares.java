package codeSignal;

import java.util.ArrayList;

public class DifferentSquares {
	public static void main(String[] args){
		int[][] matrix = {{1, 2, 1},
				          {2, 2, 2},
				          {2, 2, 2},
				          {1, 2, 3},
				          {2, 2, 1}};
		
		ArrayList<String> list = new ArrayList<String>();
		int count = 0;
		
		for ( int i = 0; i < matrix.length - 1; i++ ){
			for ( int j = 0; j < matrix[0].length - 1; j++ ){
				if(!(list.contains(matrix[i][j] + "" + matrix[i][j+1] + "" + matrix[i+1][j] + "" +matrix[i+1][j+1]))){
					count++;
					list.add(matrix[i][j] + "" + matrix[i][j+1] + "" + matrix[i+1][j] + "" +matrix[i+1][j+1]);
				}
			}
		}
		
		System.out.println(count);
	}
}
