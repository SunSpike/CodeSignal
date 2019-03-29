package codeSignal;

import java.util.Scanner;

public class SpiralArray {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
        int row,col;
        int k=0;  
        int snail[][]= new int [n][n];
        int i =1;

        for(int count = n; count > 0; count-=2){
            for(col = 0; col < n - (k*2); col++){
            	snail[k][k+col] = i;
            	i++;
            }
            for(row = 1; row < n - (k*2); row++){
            	snail[row+k][n-k-1] = i;
            	i++;
            }
            for(col = 1; col < n - (k*2); col++){
            	snail[n-k-1][n-col-k-1] = i;
            	i++;
            }
            for(row = 1; row < n - (k*2)-1; row++){
            	snail[n-row-k-1][k] = i;
            	i++;
            }
            k++;
        }

        for(row=0;row<n;row++){
            for(col=0;col<n;col++){
                System.out.printf("%3d",snail[row][col]);
            }
            System.out.println("");
        }
        
        //  1  2  3  4  5
        // 16 17 18 19  6
        // 15 24 25 20  7
        // 14 23 22 21  8
        // 13 12 11 10  9

	}
}
