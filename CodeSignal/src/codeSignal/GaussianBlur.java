package codeSignal;

public class GaussianBlur {
	public static void main(String[] args){
		int[][] image = {{36,  0,  18, 9},
						 {27,  54, 9,  0},
						 {81,  63, 72, 45}};
		
		int[][] result = new int[image.length-2][image[0].length-2];
		
		int temp = 0;

		
		for ( int i = 1; i < image.length-1; i++ ){
			for ( int j = 1; j < image[i-1].length-1; j++ ){
				temp = image[i-1][j-1] + image[i-1][j] + image[i-1][j+1] +
						image[i][j-1] + image[i][j] + image[i][j+1] +
						image[i+1][j-1] + image[i+1][j] + image[i+1][j+1];
				
				result[i-1][j-1] = temp / 9;
			}
		}
		
		for ( int i = 0; i < result.length; i++ ){
			for ( int j = 0; j < result[i].length; j++ ){
				System.out.print(result[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
