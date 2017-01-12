package exercise8_2;

import java.util.Scanner;

public class Exercise8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 4 by 4 matrix row by row");
		final int NUM_ROW=4;
		final int NUM_COL=4;

		double[][] matrix=new double[NUM_ROW][NUM_COL];

		for(int row=0;row<NUM_ROW ;row++){
			for(int col=0;col<NUM_COL;col++){
				matrix[row][col]=input.nextDouble();
			}
			
		}
		System.out.println(sumDiagonal(matrix));
		
	}
	
	public static double sumDiagonal(double[][] array){
		double sum=0;
		for(int i=0;i<array.length;i++){
		
				sum+=array[i][i];
		}
		return sum;
		
	}
	
	

}
