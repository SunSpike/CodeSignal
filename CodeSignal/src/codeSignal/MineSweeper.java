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
				try{
					if ( matrix[i-1][j-1] == true )
						count++;
				}catch(IndexOutOfBoundsException e){
					e.printStackTrace();
				}
				
				try{
					if ( matrix[i-1][j] == true )
						count++;
				}catch(IndexOutOfBoundsException e){
					e.printStackTrace();
				}
				
				try{
					if ( matrix[i-1][j+1] == true )
						count++;
				}catch(IndexOutOfBoundsException e){
					e.printStackTrace();
				}
				
				try{
					if ( matrix[i][j-1] == true )
						count++;
				}catch(IndexOutOfBoundsException e){
					e.printStackTrace();
				}
				
				try{
					if ( matrix[i][j+1] == true )
						count++;
				}catch(IndexOutOfBoundsException e){
					e.printStackTrace();
				}
				
				try{
					if ( matrix[i+1][j-1] == true )
						count++;
				}catch(IndexOutOfBoundsException e){
					e.printStackTrace();
				}
				
				try{
					if ( matrix[i+1][j] == true )
						count++;
				}catch(IndexOutOfBoundsException e){
					e.printStackTrace();
				}
				
				try{
					if ( matrix[i+1][j+1] == true )
						count++;
				}catch(IndexOutOfBoundsException e){
					e.printStackTrace();
				}
				
				result[i][j] = count;
				count = 0;
			}
		}
		
		for ( int i = 0; i < result.length; i++ ){
			for ( int j = 0; j < result[i].length; j++ ){
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
